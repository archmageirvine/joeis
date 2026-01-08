package irvine.oeis.a392;

import java.util.HashMap;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392038 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A392038 extends Sequence0 {

  // After Michael S. Branicky

  private int mN = -1;
  private final MemoryFunctionInt2<Z> mP = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      return Z.valueOf(n).pow(m);
    }
  };

  private final HashMap<String, Boolean> mB = new HashMap<>();

  private boolean computeB(final int nn, final Z n, final int i) {
    final Z m = Integers.SINGLETON.sum(1, i, j -> Z.valueOf(j).pow(nn));
    final int c = m.compareTo(n);
    if (c == 0) {
      return true;
    }
    if (c < 0) {
      return false;
    }
    final Z t = mP.get(i, nn);
    return b(nn, n.add(t), i - 1) || b(nn, n.subtract(t).abs(), i - 1);
  }

  private boolean b(final int nn, final Z n, final int i) {
    final String key = nn + "," + n + "," + i;
    final Boolean res = mB.get(key);
    if (res != null) {
      return res;
    }
    final boolean b = computeB(nn, n, i);
    mB.put(key, b);
    return b;
  }

  @Override
  public Z next() {
    ++mN;
    int k = 0;
    while (true) {
      if (b(mN, Z.valueOf(mN), ++k)) {
        return Z.valueOf(k);
      }
    }
  }
}

