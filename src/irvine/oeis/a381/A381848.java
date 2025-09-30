package irvine.oeis.a381;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a010.A010060;

/**
 * A381848 Sequence obtained by replacing 3-term subwords of A010060 by 0,1,2,3,4,5 as described in Comments.
 * @author Sean A. Irvine
 */
public class A381848 extends Sequence1 {

  private final Sequence mSeq = new A010060();
  private int mA = mSeq.next().intValue();
  private int mB = mSeq.next().intValue();

  @Override
  public Z next() {
    final int t = mA << 2;
    mA = mB;
    mB = mSeq.next().intValue();
    return Z.valueOf((t + ((long) mA << 1) + mB) - 1);
  }
}
