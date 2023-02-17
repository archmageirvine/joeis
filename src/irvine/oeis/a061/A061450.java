package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061450 a(1) = 1; a(n+1) = smallest cube &gt; a(n) with leading digit equal to final digit of a(n) and final digit not 0.
 * @author Sean A. Irvine
 */
public class A061450 extends Sequence1 {

  private Z mA = null;
  private Z mMul = Z.ONE;
  private final int mPower;

  protected A061450(final int power) {
    mPower = power;
  }

  /** Construct the sequence. */
  public A061450() {
    this(3);
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final String s = mA.toString();
      final long r = mA.mod(10);
      Z t;
      if (s.charAt(0) <= s.charAt(s.length() - 1)) {
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
          t = mA;
        } else {
          t = mMul.multiply(r);
        }
      } else {
        mMul = mMul.multiply(10);
        t = mMul.multiply(r);
      }
      while (true) {
        Z w = t.root(mPower);
        while (true) {
          w = w.add(1);
          final Z u = w.pow(mPower);
          if (u.mod(10) == 0) {
            continue;
          }
          final String v = u.toString();
          if (v.charAt(0) == s.charAt(s.length() - 1)) {
            mA = u;
            return mA;
          } else {
            break;
          }
        }
        mMul = mMul.multiply(10);
        t = t.multiply(10);
      }
    }
    return mA;
  }
}
