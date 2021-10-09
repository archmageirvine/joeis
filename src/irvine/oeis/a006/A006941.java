package irvine.oeis.a006;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A006941 Expansion of Pi in base 8.
 * @author Sean A. Irvine
 */
public class A006941 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A006941() {
    super(0, CR.PI, 8);
  }
}
