package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A004603 Expansion of Pi in base 4.
 * @author Sean A. Irvine
 */
public class A004603 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004603() {
    super(1, CR.PI, 4);
  }
}
