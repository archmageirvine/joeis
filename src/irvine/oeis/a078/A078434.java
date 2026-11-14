package irvine.oeis.a078;

import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A399911.
 * @author Sean A. Irvine
 */
public class A078434 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A078434() {
    super(1, CrFunctions.ZETA.cr(new Q(3, 2)));
  }
}

