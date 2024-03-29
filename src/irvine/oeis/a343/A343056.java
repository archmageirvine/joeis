package irvine.oeis.a343;
// Generated by gen_seq4.pl decexp at 2021-07-12 23:03

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A343056 Decimal expansion of the real part of i^(1/16), or cos(Pi/32).
 * @author Georg Fischer
 */
public class A343056 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A343056() {
    super(0, CR.ONE.divide(CR.TWO).multiply(CR.TWO.add(CR.TWO.add(CR.TWO.add(CR.TWO.sqrt()).sqrt()).sqrt()).sqrt()));
  }
}
