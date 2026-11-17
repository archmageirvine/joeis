package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a058.A058182;

/**
 * A087417 Sum of the cubes of A058182.
 * @author Sean A. Irvine
 */
public class A087417 extends Sequence0 {

  private final Sequence mS = new A058182().prepend(-1);
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(mS.next().pow(3));
    return mSum;
  }
}
