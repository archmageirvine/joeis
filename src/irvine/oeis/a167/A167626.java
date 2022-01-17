package irvine.oeis.a167;
// manually

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A167626 Prime numbers ending in the prime number 101.
 * @author Georg Fischer
 */
public class A167626 implements Sequence {

  private long mEnding;
  private long mAdd10;
  private Z mN;

  /** Construct the sequence. */
  public A167626() {
    this(101);
  }

  /**
   * Generic constructor with parameters
   * @param base base to be raised to power <code>mN</code>
   * @param add add this to the expression
   */
  public A167626(final long ending) {
    mEnding = ending;
    mAdd10 = mEnding < 10 ? 10 : (mEnding < 100 ? 100 : 1000);
    mN = Z.valueOf(mEnding);
  }

  @Override
  public Z next() {
    while (!mN.isProbablePrime()) {
      mN = mN.add(mAdd10);
    }
    final Z result = mN;
    mN = mN.add(mAdd10);
    return result;
  }
}
