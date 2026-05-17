package irvine.oeis.a223;
// manually 2026-05-16/filnum at 2026-05-16 18:12

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A223578 Positive integers k for which f(-k-1) &lt; f(-k) &lt; f(-k+1), where f(m) = floor(cot(Pi/(2m))).
 * @author Georg Fischer
 */
public class A223578 extends AbstractSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private long mK;

  private Z f(final long m) {
    return m == -1 ? Z.ZERO : REALS.cot(CR.PI.divide(CR.valueOf(2L * m))).floor();
  }

  /** Construct the sequence. */
  public A223578() {
    super(1);
    mK = 1;
  }

  @Override
  public Z next() {
    while (true) {
      ++mK;
      final Z fmk = f(-mK);
      //System.out.println("k=" + mK + ": " + f(-mK - 1) + ", " + f(-mK) + "; " + f(-mK + 1));
      if (f(-mK - 1).compareTo(fmk) < 0 && fmk.compareTo(f(-mK + 1)) < 0) {
        return Z.valueOf(mK);
      }
    }
  }
}
