package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a370.A370770;

/**
 * A078792 Number of unlabeled 3-trees on n vertices.
 * @author Sean A. Irvine
 */
public class A078792 extends Sequence1 {

  private final A370770 mSeq = new A370770();
  private int mN = 0;

  @Override
  public Z next() {
    return mSeq.t(++mN, 3);
  }
}

