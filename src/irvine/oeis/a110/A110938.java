package irvine.oeis.a110;
// Generated by gen_seq4.pl decexp at 2021-07-16 22:36

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A110938 Decimal expansion of (cosecant of 1 degree)^2.
 * Formula: 1/sin(Pi/180)^2
 * @author Georg Fischer
 */
public class A110938 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A110938() {
    super(4, CR.ONE.divide(CR.PI.divide(CR.valueOf(180)).sin().pow(CR.TWO)));
  }
}
