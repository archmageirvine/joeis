package irvine.oeis.a057;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.util.string.StringUtils;

/**
 * A057563 Numbers k such that the k initial decimal digits of e - 2 form a prime number.
 * @author Sean A. Irvine
 */
public class A057563 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final DecimalExpansionSequence mSeq = new DecimalExpansionSequence(CR.E.subtract(CR.TWO));
  private Z mA = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply(10).add(mSeq.next());
      if (mA.isProbablePrime()) {
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 1000 == 0) {
        StringUtils.message("n=" + mN);
      }
    }
  }
}

