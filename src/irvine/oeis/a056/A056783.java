package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006746;
import irvine.oeis.a006.A006747;
import irvine.oeis.a006.A006748;
import irvine.oeis.a006.A006749;
import irvine.oeis.a030.A030228;
import irvine.oeis.a142.A142886;

/**
 * A056783 Number of diamond polyominoes with n cells.
 * @author Sean A. Irvine
 */
public class A056783 extends Sequence1 {

  private final Sequence mA = new A006749();
  private final Sequence mB = new A006746();
  private final Sequence mC = new A006748();
  private final Sequence mD = new A006747();
  private final Sequence mE = new A056877();
  private final Sequence mF = new A056878();
  private final Sequence mG = new A030228();
  private final Sequence mH = new A142886();
  {
    mG.next();
    mH.next();
  }

  @Override
  public Z next() {
    return mA.next()
      .add(mB.next())
      .add(mC.next().multiply2())
      .add(mD.next())
      .add(mE.next())
      .add(mF.next().multiply2())
      .add(mG.next())
      .add(mH.next());
  }
}
