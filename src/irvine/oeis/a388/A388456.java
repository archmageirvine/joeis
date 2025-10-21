package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388456 allocated for Robert G. Wilson v.
 * @author Sean A. Irvine
 */
public class A388456 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388456() {
    super(1, CR.TWO.pow(new Q(1, 8)));
  }
}
