package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006577;
import irvine.oeis.a006.A006884;
import irvine.oeis.a006.A006885;

/**
 * A006577.
 * @author Sean A. Irvine
 */
public class A395130 extends Sequence1 {

  private final Sequence mA = new A006884();
  private final Sequence mB = new A006885();
  private final DirectSequence mC = new A006577();

  @Override
  public Z next() {
    return mC.a(mA.next()).subtract(mC.a(mB.next()));
  }
}
