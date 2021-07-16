package irvine.oeis.a164;
// manually (decexp) at 2021-07-16

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A164629 Expansion of phi (golden ratio) in base 5.
 * @author Georg Fischer
 */
public class A164629 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A164629() {
    super(1, CR.PHI, 5);
  }
}
