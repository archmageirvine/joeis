package irvine.oeis.a122;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A122670 If n mod 4 = 2 or n mod 4 = 3 then a(n) = 0 else let m=floor(n/4), then a(n) = (2*m)!/m!.
 * @author Sean A. Irvine
 */
public class A122670 implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final int t = mN & 3;
    if (t == 2 || t == 3) {
      return Z.ZERO;
    }
    final int m = mN >>> 2;
    return mF.factorial(2 * m).divide(mF.factorial(m));
  }
}

