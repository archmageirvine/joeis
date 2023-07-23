package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a024.A024619;

/**
 * A056835 a(n) = lcm(s(1),...,s(n)) where {s(n)} = A024619 and a(0) = 1.
 * @author Sean A. Irvine
 */
public class A056835 extends AbstractSequence {

  private final A024619 mSeq1 = new A024619();

  /** Construct the sequence. */
  public A056835() {
    super(0);
  }

  private Z mLcm = null;

  @Override
  public Z next() {
    mLcm = mLcm == null ? Z.ONE : mLcm.lcm(mSeq1.next());
    return mLcm;
  }
}
