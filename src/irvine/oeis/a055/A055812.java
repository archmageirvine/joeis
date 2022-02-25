package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055812 a(n) and floor(a(n)/5) are both squares; i.e., squares which remain squares when written in base 5 and last digit is removed.
 * @author Georg Fischer
 */
public class A055812 implements Sequence {

  private Z mK;
  private int mDiv;

  /** Construct the sequence. */
  public A055812() {
    this(5);
  }

  /**
   * Generic constructor with parameter
   * @param div divisor
   */
  public A055812(final int div) {
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
    return k2;
  }
}
