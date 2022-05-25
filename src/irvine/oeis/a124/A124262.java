package irvine.oeis.a124;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A124262 a(1) = 2; for n &gt; 1, a(n) is largest prime &lt; 10*a(n-1).
 * @author Georg Fischer
 */
public class A124262 implements Sequence {

  private Z mA;
  private long mMult;
  private int mStart;

  /** Construct the sequence. */
  public A124262() {
    this(10, 2);
  }

  /**
   * Generic constructor with parameters
   * @param mult multiplicative factor
   * @param start first prime
   */
  public A124262(final long mult, final int start) {
    mA = Z.valueOf(start);
    mMult = mult;
  }

  @Override
  public Z next() {
    final Z result = mA;
    Z cand = mA.multiply(mMult);
    if (cand.isEven()) {
      cand = cand.subtract(1);
    }
    while (!cand.isProbablePrime()) {
      cand = cand.subtract(2);
    }
    mA = cand;
    return result;
  }
}
