package irvine.oeis.a123;
// Generated by gen_seq4.pl floor at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A123860 a(n) = ceiling( (7 + sqrt(49+24*n))/2 ).
 * @author Georg Fischer
 */
public class A123860 extends FloorSequence {
  /** Construct the sequence. */
  public A123860() {
    super(-2);
  }

  protected Z evalCR(final long n) {
    return CR.SEVEN.add(CR.valueOf(49).add(CR.valueOf(24).multiply(CR.valueOf(n))).sqrt()).divide(CR.TWO).ceil();
  }

}
