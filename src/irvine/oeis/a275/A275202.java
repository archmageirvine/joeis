package irvine.oeis.a275;
// manually knestm/knest at 2023-03-13

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005942;

/**
 * A275202 Subword complexity (number of distinct blocks of length n) of the period doubling sequence A096268.
 * @author Georg Fischer
 */
public class A275202 extends Sequence1 {

  private final A005942 mSeq = new A005942();

  {
    mSeq.next();
    mSeq.next();
  }

  @Override
  public Z next() {
    return mSeq.next().divide2();
  }
}
