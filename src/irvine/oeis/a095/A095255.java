package irvine.oeis.a095;
// Generated by gen_seq4.pl floor at 2021-08-28 23:11

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;
/**
 * A095255 a(n) = floor(10^n*log(n)).
 * @author Georg Fischer
 */
public class A095255 extends FloorSequence {
  /** Construct the sequence. */
  public A095255() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return CR.TEN.pow(CR.valueOf(n)).multiply(CR.valueOf(n).log()).floor();
  }

}
