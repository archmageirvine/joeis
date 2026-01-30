package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A392846 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A392846 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A392846() {
    super(2, CR.valueOf(new Q(9, 2)).exp());
  }
}

