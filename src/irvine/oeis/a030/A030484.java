package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A030484 Squares composed of digits {2,5,6}.
 * @author Sean A. Irvine
 */
public class A030484 extends AbstractSequence {

  /** Construct the sequence. */
  public A030484() {
    super(1);
  }

  // 1 -> 2, 2 -> 5, 0 -> 6

  private static final long[] MAP = {6, 2, 5};
  private long mN = 0;

  private Z to256(final long n) {
    long m = n;
    Z t = Z.ONE;
    Z a = Z.ZERO;
    while (m > 0) {
      final int r = (int) (m % 3);
      m /= 3;
      if (r == 0) {
        --m;
      }
      a = t.multiply(MAP[r]).add(a);
      t = t.multiply(10);
    }
    return a;
  }

  @Override
  public Z next() {
    while (true) {
      final Z a = to256(++mN);
      final long r = a.mod(100);
      if ((r == 25 || r == 56) && a.isSquare()) {
        return a;
      }
    }
  }
}
