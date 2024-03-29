package irvine.oeis.a302;
// Generated by gen_seq4.pl dex CR.TWO.multiply(CR.PI.divide(CR.valueOf(192)).sin()) false 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A302714 Decimal expansion of 2*sin(Pi/192).
 * @author Georg Fischer
 */
public class A302714 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A302714() {
    super(-1, CR.TWO.multiply(CR.PI.divide(CR.valueOf(192)).sin()));
  }
}
