package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006318;
import irvine.oeis.a104.A104550;

/**
 * A007762 Number of domino tilings of a certain region.
 * @author Georg Fischer
 */
public class A007762 extends Sequence1 {

  private final A006318 mSeq1 = new A006318();
  private final A104550 mSeq2 = new A104550();

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}
