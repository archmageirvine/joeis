package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000013;
import irvine.oeis.a003.A003239;
import irvine.oeis.a011.A011782;
import irvine.oeis.a128.A128014;

/**
 * A045675 Number of 2n-bead balanced binary necklaces which are not equivalent to their reverse, complement or reversed complement.
 * @author Sean A. Irvine
 */
public class A045675 extends A003239 {

  private final Sequence mA = new A128014();
  private final Sequence mB = new A000013();
  private final Sequence mC = new A011782();
  private final Sequence mD = new A045674();

  @Override
  public Z next() {
    return super.next().subtract(mA.next()).subtract(mB.next()).subtract(mC.next()).add(mD.next().multiply2());
  }
}
