package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A037276 Start with 1; for n&gt;1, replace n with the concatenation of its prime factors in increasing order.
 * @author Sean A. Irvine
 */
public class A037276 extends AbstractSequence {

  /* Construct the sequence. */
  public A037276() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final StringBuilder sb = new StringBuilder();
    final FactorSequence fs = Jaguar.factor(mN);
    for (final Z p : fs.toZArray()) {
      for (int k = 0; k < fs.getExponent(p); ++k) {
        sb.append(p);
      }
    }
    return new Z(sb);
  }
}

