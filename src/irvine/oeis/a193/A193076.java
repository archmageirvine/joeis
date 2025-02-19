package irvine.oeis.a193;
// Generated by gen_seq4.pl 2025-02-08.ack/decexp at 2025-02-08 09:46

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A193076 Decimal expansion of the coefficient of x in the reduction of phi^x by x^2-&gt;x+1, where phi=(1+sqrt(5))/2 is the golden ratio (A001622).
 * Formula:
 * @author Georg Fischer
 */
public class A193076 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A193076() {
    super(0, CR.PHI.pow(CR.PHI).subtract(CR.PHI.pow(CR.ONE.subtract(CR.PHI))).divide(CR.FIVE.sqrt()));
  }
}
