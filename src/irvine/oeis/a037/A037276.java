package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A037276 Start with 1; for n&gt;1, replace n with the concatenation of its prime factors in increasing order.
 * @author Sean A. Irvine
 */
public class A037276 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A037276(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A037276() {
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
        sb.append(p);
      }
    }
    return new Z(sb);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

}

