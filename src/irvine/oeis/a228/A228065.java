package irvine.oeis.a228;

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a057.A057834;

/**
 * A228065 Difference of consecutive integers nearest to (10^n)/log(10^n) (A057834).
 * @author Georg Fischer
 */
public class A228065 extends Sequence1 {

  private int mN = 0;
  private final DifferenceSequence mSeq1 = new DifferenceSequence(new A057834());

  @Override
  public Z next() {
    ++mN;
    return (mN == 1) ? Z.FOUR : mSeq1.next();
  }
}
