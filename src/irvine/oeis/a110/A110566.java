package irvine.oeis.a110;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002805;
import irvine.oeis.a003.A003418;

/**
 * A110566 a(n) = lcm{1,2,...,n}/denominator of harmonic number H(n).
 * @author Georg Fischer
 */
public class A110566 extends Sequence1 {

  private final Sequence mHarmSeq = new A002805(); // denominators of harmonic numbers
  private final Sequence mLCMnSeq = new A003418(); // LCM(seq(1..n))

  {
    mLCMnSeq.next();
  }

  @Override
  public Z next() {
    return mLCMnSeq.next().divide(mHarmSeq.next());
  }
}
