package irvine.oeis.a122;

import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;

/**
 * A122670 If <code>n mod 4 = 2</code> or <code>n mod 4 = 3</code> then <code>a(n) = 0</code> else let <code>m=floor(n/4)</code>, then <code>a(n) = (2*m)!/m!</code>.
 * @author Sean A. Irvine
 */
public class A122670 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
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

