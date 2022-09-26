package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a000.A000201;

/**
 * A022413 Kim-sums: "Kimberling sums" K_n + K_2.
 * @author Sean A. Irvine
 */
public class A022413 extends A000201 {

  private long mN = 2;

  @Override
  public int getOffset() {
    return 0;
  }

  @Override
  public Z next() {
    return ++mN == 3 ? Z.ONE : super.next().add(mN);
  }
}
