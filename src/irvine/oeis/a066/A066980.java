package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A066980 Numbers k such that antid(k) &gt; antid(k+1) and santid(k) &gt; santid(k+1), where antid(k) = A066272 and santid(k) = A066417.
 * @author Sean A. Irvine
 */
public class A066980 extends Sequence1 {

  private final Sequence mSigmaA0 = new A066272();
  private final Sequence mSigmaA1 = new A066417();
  private Z mS0 = mSigmaA0.next();
  private Z mS1 = mSigmaA1.next();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z s0 = mS0;
      final Z s1 = mS1;
      mS0 = mSigmaA0.next();
      mS1 = mSigmaA1.next();
      if (s0.compareTo(mS0) > 0 && s1.compareTo(mS1) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
