package irvine.oeis.a003;

import java.util.HashMap;
import java.util.Map;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicArray;

/**
 * A003271 Smallest number that requires n iterations of the unitary totient function (A047994) to reach 1.
 * @author Sean A. Irvine
 */
public class A003271 extends Sequence0 {

  private final Map<Z, Z> mUnitaryPhi = new HashMap<>();
  private final DynamicArray<Z> mSmallest = new DynamicArray<>();
  private int mN = -1;
  private Z mM = Z.ZERO;

  // unitary totient function
  private Z uphi(final Z u) {
    final Z r = mUnitaryPhi.get(u);
    if (r != null) {
      return r;
    }
    final FactorSequence fs = Jaguar.factor(u);
    Z p = Z.ONE;
    for (final Z q : fs.toZArray()) {
      p = p.multiply(q.pow(fs.getExponent(q)).subtract(1));
    }
    mUnitaryPhi.put(u, p);
    return p;
  }

  private final Map<Z, Integer> mIteratedUnitaryPhi = new HashMap<>();
  {
    mIteratedUnitaryPhi.put(Z.ONE, 0);
  }

  private int iteratedUnitaryPhi(final Z n) {
    final Integer r = mIteratedUnitaryPhi.get(n);
    if (r != null) {
      return r;
    }
    final int i = iteratedUnitaryPhi(uphi(n)) + 1;
    mIteratedUnitaryPhi.put(n, i);
    return i;
  }

  @Override
  public Z next() {
    ++mN;
    while (mSmallest.get(mN) == null) {
      mM = mM.add(1);
      final int c = iteratedUnitaryPhi(mM);
      if (mSmallest.get(c) == null) {
        mSmallest.set(c, mM);
      }
    }
    return mSmallest.get(mN);
  }

}
