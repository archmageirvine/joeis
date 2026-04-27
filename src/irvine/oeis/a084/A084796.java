package irvine.oeis.a084;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A084796 Replace n with concatenation of its prime factors in decreasing order.
 * @author Sean A. Irvine
 */
public class A084796 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A084796(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A084796() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }

  @Override
  public Z a(final Z n) {
    if (n.isOne()) {
      return Z.ONE;
    }
    final StringBuilder sb = new StringBuilder();
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      for (int k = 0; k < fs.getExponent(p); ++k) {
        sb.insert(0, p.toString());
      }
    }
    return new Z(sb);
  }

  @Override
  public Z a(final long n) {
    return a(Z.valueOf(n));
  }

}

