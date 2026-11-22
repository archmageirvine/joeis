package irvine.oeis.a122;

import irvine.math.z.Z;
import irvine.oeis.a056.A056152;

/**
 * A122083 Triangle read by rows in which row n gives the number of unlabeled bicolored graphs having k nodes of one color and n-k nodes of the other color, with no isolated nodes; the color classes are not interchangeable.
 * @author Gregory Morse
 */
public class A122083 extends A056152 {
  private int mN = -1;
  private int mK = 0;

  /** Construct the sequence. */
  public A122083() {
    super(0);
  }

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 0;
    }
    if (mN == 0) {
      return Z.ONE;
    }
    return mK == 0 || mK == mN ? Z.ZERO : a(mK, mN - mK);
  }
}
