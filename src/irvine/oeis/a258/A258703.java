package irvine.oeis.a258;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;
/**
 * A258703 a(n) = floor(n/sqrt(2) - 1/2).
 * @author Georg Fischer
 */
public class A258703 extends FloorSequence {

  /** Construct the sequence. */
  public A258703() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return CR.HALF.multiply(CR.valueOf(n)).multiply(CR.SQRT2).add(CR.HALF).floor().subtract(Z.ONE);
  }
}
