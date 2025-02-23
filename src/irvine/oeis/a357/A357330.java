package irvine.oeis.a357;
// Generated by gen_seq4.pl 2024-12-01.ack/decexp at 2024-12-01 23:03

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A357330 Decimal expansion of sigma(N) / (N * log(log(N))) for N = 5040, where sigma = A000203.
 * Formula: sigma(N) / (N * log(log(N))) for N = 5040, where sigma = F000203
 * @author Georg Fischer
 */
public class A357330 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A357330() {
    super(1, CR.valueOf(Functions.SIGMA1.z(5040)).divide(CR.valueOf(5040).log().log().multiply(5040)));
  }
}
