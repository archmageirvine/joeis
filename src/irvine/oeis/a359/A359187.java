package irvine.oeis.a359;

import irvine.math.cc.CC;
import irvine.math.cc.ComputableComplexField;
import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A359187 allocated for Marco Rip\u00e0.
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
