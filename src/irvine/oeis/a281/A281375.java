package irvine.oeis.a281;
// Generated by gen_seq4.pl floor at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A281375 a(n) = floor(2^(n+1)/n).
 * @author Georg Fischer
 */
public class A281375 extends FloorSequence {
  /** Construct the sequence. */
  public A281375() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return CR.TWO.pow(CR.valueOf(n).add(CR.ONE)).divide(CR.valueOf(n)).floor();
  }

}
