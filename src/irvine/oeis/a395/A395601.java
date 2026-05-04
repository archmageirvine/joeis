package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395601 allocated for Amiram Eldar.
 * @author Sean A. Irvine
 */
public class A395601 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395601() {
    super(0, CR.LOG2.divide(6).add(new Q(7, 12)));
  }
}

