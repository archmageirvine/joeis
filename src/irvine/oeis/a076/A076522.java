package irvine.oeis.a076;
// Generated by gen_seq4.pl floor at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A076522 Floor( n*log_2(4*n/3) ).
 * @author Georg Fischer
 */
public class A076522 extends FloorSequence {
  /** Construct the sequence. */
  public A076522() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return CR.valueOf(n).multiply(CR.FOUR.multiply(CR.valueOf(n)).divide(CR.THREE).log().divide(CR.TWO.log())).floor();
  }

}
