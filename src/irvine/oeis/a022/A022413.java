package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a000.A000201;

/**
 * A022413 <code>Kim-sums</code>: "Kimberling sums" <code>K_n + K_2</code>.
 * @author Sean A. Irvine
 */
public class A022413 extends A000201 {

  private long mN = 2;

  @Override
  public Z next() {
    return ++mN == 3 ? Z.ONE : super.next().add(mN);
  }
}
