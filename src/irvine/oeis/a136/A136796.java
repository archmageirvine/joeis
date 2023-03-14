package irvine.oeis.a136;
// manually knestm/knest at 2023-03-02 16:06

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a052.A052764;

/**
 * A136796 Number of labeled marked rooted trees with n nodes.
 * @author Georg Fischer
 */
public class A136796 extends Sequence1 {

  private final A052764 mSeq = new A052764();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return mSeq.next().multiply2();
  }
}
