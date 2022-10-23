package irvine.oeis.a114;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A114254 Sum of all terms on the two principal diagonals of a 2n+1 X 2n+1 square spiral.
 * @author Sean A. Irvine
 */
public class A114254 extends Sequence0 {

  /**
   * Compute sequence at <code>2*n+1</code>.
   * @param n radius of spiral
   * @return sum of diagonals
   */
  public static Z a(final long n) {
    final Z m = Z.valueOf(n);
    final Z m2 = m.square();
    final Z m3 = m2.multiply(m);
    return m3.shiftLeft(4).add(m.multiply(26)).divide(3).add(m2.multiply(10)).add(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }
}

