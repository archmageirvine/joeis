package irvine.oeis.a176;
// manually deris2/essent 0 A000367 at 2021-11-04 15:02
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000367;

/**
 * A176840 Variant of A176546 with the sign of the second term switched.
 * Essentially the same as A000367. Also the nonzero entries of A027641.
 * @author Georg Fischer
 */
public class A176840 extends A000367 {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.NEG_ONE : super.next();
  }
}

