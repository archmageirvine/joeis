package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A001865 Number of connected functions on n labeled nodes.
 * @author Sean A. Irvine
 */
public class A001865 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A001865(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A001865() {
    super(1);
  }

  protected long mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return a(n.longValueExact());
  }

  @Override
  public Z a(final long n) {
    Z s = Z.ZERO;
    Z m = Z.ONE;
    for (int k = 0; k < n; ++k) {
      if (k > 1) {
        m = m.multiply(n);
      }
      final long l = k == 0 ? n - 1 : n;
      final Z t = Functions.FACTORIAL.z(l).multiply(m).divide(Functions.FACTORIAL.z(k));
      s = s.add(t);
    }
    return s;
  }

}
