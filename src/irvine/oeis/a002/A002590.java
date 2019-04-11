package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002590 Largest prime factor of <code>16^n + 1</code>.
 * @author Sean A. Irvine
 */
public class A002590 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = -4;

  @Override
  public Z next() {
    mN += 4;
    final Z t = Z.ONE.shiftLeft(mN).add(1);
    if (mVerbose) {
      System.out.println("Doing: 2^" + mN + "+1=" + t);
    }
    return A002582.lpf(t);
  }
}
