package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A070771 b+c+d+e where b&gt;=c&gt;=d&gt;=e&gt;=0 ordered by b then c then d then e.
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
