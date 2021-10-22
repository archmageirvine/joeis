package irvine.oeis.a052;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.a037.A037077;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A052110 The decimal expansion of c^c^c^...  where c is the constant defined in A037077.
 * @author Sean A. Irvine
 */
public class A052110 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A052110() {
    super(0, new UnaryCRFunction() {
      @Override
      public CR execute(final CR x) {
        return x.pow(x.inverse()).subtract(new A037077().getCR());
      }
    }.inverseMonotone(CR.valueOf("0.46"), CR.valueOf("0.462")).execute(CR.ZERO));
  }
}

