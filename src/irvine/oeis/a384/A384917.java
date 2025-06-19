package irvine.oeis.a384;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A384917 allocated for Davide Rotondo.
 * @author Sean A. Irvine
 */
public class A384917 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A384917() {
    super(0, CR.valueOf(new Q(1, 3645)));
  }
}

