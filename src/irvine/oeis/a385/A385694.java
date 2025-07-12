package irvine.oeis.a385;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A078691.
 * @author Sean A. Irvine
 */
public class A385694 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A385694() {
    super(1, CR.SQRT2.inverse().add(CR.valueOf(27).sqrt().divide(2)));
  }
}

