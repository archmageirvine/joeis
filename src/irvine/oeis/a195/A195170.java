package irvine.oeis.a195;
// Generated by gen_seq4.pl floor at 2021-08-31 21:27

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A195170 a(n) = 4*n - floor(n*r), where r=(1+sqrt(5))/2 (the golden ratio).
 * @author Georg Fischer
 */
public class A195170 extends FloorSequence {
  /** Construct the sequence. */
  public A195170() {
    super(0);
  }

  protected Z evalCR(final long n) {
    return Z.FOUR.multiply(Z.valueOf(n)).subtract(CR.PHI.multiply(CR.valueOf(n)).floor());
  }

}
