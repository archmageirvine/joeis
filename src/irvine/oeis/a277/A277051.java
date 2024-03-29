package irvine.oeis.a277;
// Generated by gen_seq4.pl floor at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A277051 a(n) = floor(n/(1-3/Pi)).
 * @author Georg Fischer
 */
public class A277051 extends FloorSequence {
  /** Construct the sequence. */
  public A277051() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return CR.valueOf(n).divide(CR.ONE.subtract(CR.THREE.divide(CR.PI))).floor();
  }

}
