package irvine.oeis.a272;
// Generated by gen_seq4.pl 2024-06-06/decexp at 2024-06-06 20:10

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A272055 Decimal expansion of -1/(e^2 Ei(-1)), an increasing rooted tree enumeration constant associated with the Euler-Gompertz constant, where Ei is the exponential integral.
 * Formula:
 * @author Georg Fischer
 */
public class A272055 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A272055() {
    super(0, CR.E.multiply(CrFunctions.EI.cr(CR.ONE.negate()).negate().multiply(CR.E)).inverse());
  }
}
