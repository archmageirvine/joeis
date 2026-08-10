package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a371.A371991;

/**
 * A011953 Number of Barlow packings with group P3m1 that repeat after n layers.
 * @author Sean A. Irvine
 */
public class A011953 extends AbstractSequence {

  private final DirectSequence mA371991 = DirectSequence.create(new A371991());
  private final DirectSequence mA011946 = DirectSequence.create(new A011946());
  private final DirectSequence mA011947 = DirectSequence.create(new A011947());
  private final DirectSequence mA011948 = DirectSequence.create(new A011948());
  private final DirectSequence mA011949 = DirectSequence.create(new A011949());
  private final DirectSequence mA011950 = DirectSequence.create(new A011950());
  private final DirectSequence mA011951 = DirectSequence.create(new A011951());
  private final DirectSequence mA011952 = DirectSequence.create(new A011952());
  private int mN = 8;

  /** Construct the sequence. */
  public A011953() {
    super(9);
  }

  private Z get(final DirectSequence seq, final int n, final int min) {
    return n >= min ? seq.a(n) : Z.ZERO;
  }

  @Override
  public Z next() {
    final int n = ++mN;
    Z result = mA371991.a(n);

    if ((n & 3) == 0) {
      result = result.subtract(mA011946.a(n / 4));
    } else if ((n & 3) == 2) {
      result = result.subtract(mA011947.a((n - 2) / 4));
    }

    if ((n & 1) == 0) {
      final int k = n / 2;
      result = result.subtract(get(mA011948, k, 6));
      result = result.subtract(mA011949.a(k));
      result = result.subtract(mA011951.a(k));
      result = result.subtract(get(mA011952, k, 4));
    }

    if ((n & 1) == 1) {
      result = result.subtract(mA011950.a((n + 1) / 2));
    }

    return result;
  }
}
