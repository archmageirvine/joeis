package irvine.oeis.a367;
// Generated by gen_seq4.pl 2024-06-07/decexp at 2024-06-09 22:55

import irvine.oeis.a090.A090986;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A367976 Decimal expansion of Sum_{k &gt;= 0} (-1)^k/(1+k^2).
 * Formula:
 * @author Georg Fischer
 */
public class A367976 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A367976() {
    super(0, new A090986().getCR().add(1).divide(2));
  }
}
