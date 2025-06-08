package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a045.A045683;

/**
 * A011951 Number of Barlow packings with group P3(bar)m1(S) that repeat after 2n layers.
 * @author Sean A. Irvine
 */
public class A011951 extends A011955 {

  // After R. J. Mathar

  private final DirectSequence mA045683 = DirectSequence.create(new A045683());
  private int mN = 0;

  /** Construct the sequence. */
  public A011951() {
    super(1);
  }

  private Z fracR(final int phalf) {
    return (phalf & 1) == 0 ? bb(phalf, phalf).subtract(mA045683.a(phalf)).divide2() : Z.ZERO;
  }

  @Override
  public Z next() {
    mN += 2;
    Z sum = fracR(mN / 2);
    for (long q = 0; q < mN; ++q) {
      final long p = mN - q;
      if (p < q && (p - q) % 3 == 0) {
        sum = sum.add(bb(p, q));
      }
    }
    return sum;
  }
}
