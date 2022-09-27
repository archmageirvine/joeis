package irvine.oeis.a130;
// manually dersimple at 2021-08-25 19:44

import irvine.math.z.Z;
import irvine.oeis.a000.A000517;

/**
 * A130660 1/16 the number of permutations of 0..n having exactly 4 maxima.
 * @author Georg Fischer
 */
public class A130660 extends A000517 {

  private int mN = 0;

  @Override
  public int getOffset() {
    return 0;
  }

  @Override
  public Z next() {
    ++mN;
    return mN <= 6 ? Z.ZERO : super.next().divide(16);
  }
}
