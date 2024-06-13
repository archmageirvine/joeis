package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A070771.
 * @author Sean A. Irvine
 */
public class A070771 extends Sequence0 {

  private final Bumper mBumper = BumperFactory.weaklyDecreasing();
  private int[] mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = new int[4];
    } else {
      mBumper.bump(mA);
    }
    return Functions.SUM.z(mA);
  }
}
