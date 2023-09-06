package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A065580 Smallest prime ending in exactly n 3's.
 * @author Sean A. Irvine
 */
public class A065580 extends Sequence1 {

  private final long mDigit;
  private int mN = 0;

  protected A065580(final long digit) {
    mDigit = digit;
  }

  /** Construct the sequence. */
  public A065580() {
    this(3);
  }

  @Override
  public Z next() {
    final String s = StringUtils.rep((char) ('0' + mDigit), ++mN);
    final Z t0 = new Z(s);
    if (t0.isProbablePrime()) {
      return t0;
    }
    long k = 0;
    while (true) {
      if (++k % 10 != mDigit) {
        final Z t = new Z(k + s);
        if (t.isProbablePrime()) {
          return t;
        }
      }
    }
  }
}
