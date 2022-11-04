package irvine.oeis.a126;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A126616 a(n) = n for n &lt; 10, a(10*n) = a(n), and if the terms a(10), a(20), a(30), ... are deleted, one gets back the original sequence.
 * <code>(PARI) a(n, m=4)=while(n&gt;=m, if(n%m, n-=n\m, n\=m)); n</code>
 * @author Georg Fischer
 */
public class A126616 extends Sequence1 {

  private int mN;
  private final int mParm;

  /** Construct the sequence. */
  public A126616() {
    this(10);
  }

  /**
   * Generic constructor with parameters
   * @param parm delete every <code>parm</code>th term
   */
  public A126616(final int parm) {
    mN = 0;
    mParm = parm;
  }

  @Override
  public Z next() {
    int n = ++mN;
    while (n >= mParm) {
      if (n % mParm > 0) {
        n -= n / mParm;
      } else {
        n /= mParm;
      }
    }
    return Z.valueOf(n);
  }
}
