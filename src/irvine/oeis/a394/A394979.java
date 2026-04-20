package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SumOfLikePowersSequence;

/**
 * A394979 Minimum k such that k^5 can be expressed as the sum of n distinct positive 5th powers.
 * @author Sean A. Irvine
 */
public class A394979 extends AbstractSequence {

  private int mN = 3;

  /** Construct the sequence. */
  public A394979() {
    super(4);
  }

  @Override
  public Z next() {
    final Sequence s = new SumOfLikePowersSequence(5, ++mN, mN, true);
    while (true) {
      final Z t = s.next();
      final Z r = t.root(5);
      if (t.auxiliary() == 1) {
        return r;
      }
    }
  }
}
