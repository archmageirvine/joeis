package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a006.A006337;

/**
 * A080763 Exchange 1's and 2's in the eta-sequence A006337.
 * @author Georg Fischer
 */
public class A080763 extends A006337 {

  @Override
  public Z next() {
    return super.next().equals(Z.ONE) ? Z.TWO : Z.ONE;
  }
}
