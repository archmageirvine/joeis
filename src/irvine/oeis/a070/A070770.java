package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A070770 b + c + d where b &gt;= c &gt;= d &gt;= 0 ordered by b then c then d.
 * @author Sean A. Irvine
 */
public class A070770 extends Sequence0 {

  private final Bumper mBumper = BumperFactory.weaklyDecreasing();
  private int[] mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = new int[3];
    } else {
      mBumper.bump(mA);
    }
    return Functions.SUM.z(mA);
  }
}
