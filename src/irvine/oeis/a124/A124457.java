package irvine.oeis.a124;
// Generated by gen_seq4.pl dex CR.ONE.add(CR.HALF).add(CR.ONE_THIRD).exp() true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A124457 Decimal expansion of exp(1 + 1/2 + 1/3).
 * @author Georg Fischer
 */
public class A124457 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A124457() {
    super(CR.ONE.add(CR.HALF).add(CR.ONE_THIRD).exp());
  }
}
