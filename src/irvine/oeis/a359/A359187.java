package irvine.oeis.a359;

import irvine.math.cc.CC;
import irvine.math.cc.ComputableComplexField;
import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A359187 Decimal expansion of the real part of (-sqrt(2))^^9, where ^^ indicates tetration or hyper-4 (e.g., 2^^4 = 2^(2^(2^2))).
 * @author Sean A. Irvine
 */
public class A359187 extends DecimalExpansionSequence {

  private static CR build() {
    final CC s = new CC(CR.SQRT2.negate());
    CC t = s;
    for (int k = 0; k < 8; ++k) {
      t = ComputableComplexField.SINGLETON.pow(s, t);
    }
    return t.re();
  }

  /** Construct the sequence. */
  public A359187() {
    super(build());
  }
}
