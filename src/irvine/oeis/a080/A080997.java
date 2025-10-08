package irvine.oeis.a080;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a018.A018804;

/**
 * A080910.
 * @author Sean A. Irvine
 */
public class A080997 extends Sequence1 {

  private final A018804 mS = new A018804();
  private final TreeSet<Z> mA = new TreeSet<>((x, y) -> {
    final Z u = mS.a(x);
    final Z v = mS.a(y);
    final int c = v.multiply(x.square()).compareTo(u.multiply(y.square()));
    if (c != 0) {
      return c;
    }
    return x.compareTo(y);
  });
  private long mN = 0;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().multiply2().compareTo(mN) > 0) {
      mA.add(Z.valueOf(++mN));
    }
    return mA.pollFirst();
  }
}

