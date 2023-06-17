package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A030177 When squared gives number composed of digits {4, 5, 6}.
 * @author Sean A. Irvine
 */
public class A030177 extends AbstractSequence {

  /** Construct the sequence. */
  public A030177() {
    super(0);
  }

  // n^2 only ends with 4, 5, 6, if n ends with 2, 4, 5, 6, or 8
  private static final long[] SHIFT = {4, 2, 1, 1, 2};

  private Z mN = Z.valueOf(-2);
  private int mIndex = -1;

  private boolean is456(Z n) {
    while (!n.isZero()) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      if (qr[1].compareTo(Z.THREE) <= 0 || qr[1].compareTo(Z.SIX) > 0) {
        return false;
      }
      n = qr[0];
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mIndex == SHIFT.length) {
        mIndex = 0;
      }
      mN = mN.add(SHIFT[mIndex]);
      if (is456(mN.square())) {
        return mN;
      }
    }
  }
}
