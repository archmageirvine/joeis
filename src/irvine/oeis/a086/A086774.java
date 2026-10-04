package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A400353.
 * @author Sean A. Irvine
 */
public class A086774 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A086774() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        CR s = CR.ZERO;
        while (true) {
          final Z t = s.getApprox(precision);
          s = s.add(CR.E).inverse();
          if (s.getApprox(precision).equals(t)) {
            return t;
          }
        }
      }
    });
  }
}

