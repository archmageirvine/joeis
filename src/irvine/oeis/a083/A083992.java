package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083992 a(1) = 1; then the smallest number such that both the forward and reverse n-th partial concatenation is a prime for n &gt; 1. (Reverse concatenation is taken term-wise and not digit-wise.).
 * @author Sean A. Irvine
 */
public class A083992 extends Sequence1 {

  private String mForward = null;
  private String mReverse;

  protected A083992(final String start) {
    mReverse = start;
  }

  /** Construct the sequence. */
  public A083992() {
    this("1");
  }

  @Override
  public Z next() {
    if (mForward == null) {
      mForward = mReverse;
      return new Z(mForward);
    }
    long k = 0;
    while (true) {
      ++k;
      final String f = mForward + k;
      if (new Z(f).isProbablePrime()) {
        final String r = k + mReverse;
        if (new Z(r).isProbablePrime()) {
          mForward = f;
          mReverse = r;
          return Z.valueOf(k);
        }
      }
    }
  }
}
