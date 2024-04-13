package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001128 Reverse digits of previous term and multiply by previous term.
 * @author Sean A. Irvine
 */
public class A001128 extends Sequence1 {

  private Z mS = null;

  @Override
  public Z next() {
    if (mS == null) {
      mS = Z.TWO;
    } else {
      mS = mS.multiply(Functions.REVERSE.z(mS));
    }
    return mS;
  }
}

