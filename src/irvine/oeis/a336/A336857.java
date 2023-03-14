package irvine.oeis.a336;
// manually knest at 2023-03-13

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006003;

/**
 * A336857 The digit sum of n*(n^2 + 1)/2.
 * @author Georg Fischer
 */
public class A336857 extends Sequence1 {

  private final A006003 mSeq = new A006003();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(mSeq.next()));
  }
}
