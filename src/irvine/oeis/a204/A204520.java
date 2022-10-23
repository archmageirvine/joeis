package irvine.oeis.a204;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A204520 Numbers such that floor(a(n)^2 / 5) is a square.
 * @author Georg Fischer
 */
public class A204520 extends Sequence1 {

  private Z mK;
  private int mDiv;

  /** Construct the sequence. */
  public A204520() {
    this(5);
  }

  /**
   * Generic constructor with parameters
   * @param div
   */
  public A204520(final int div) {
    mDiv = div;
    mK = Z.NEG_ONE;
  }

  @Override
  public Z next() {
    mK = mK.add(1);
    Z k2 = mK.square();
    while (!k2.divide(mDiv).isSquare()) {
      mK = mK.add(1);
      k2 = mK.square();
    }
    return mK;
  }
}
