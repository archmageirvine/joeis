package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A083029.
 * @author Sean A. Irvine
 */
public class A392290 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A392290() {
    super(0, CR.valueOf(7).sqrt().inverse().subtract(CR.valueOf(new Q(2, 7))));
  }
}

