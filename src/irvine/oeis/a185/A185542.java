package irvine.oeis.a185;
// manually floor at 2021-09-01 16:25

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A185542 a(n) = m*(m+1)/2, where m = floor(n^(5/2)).
 * @author Georg Fischer
 */
public class A185542 extends FloorSequence {
  /** Construct the sequence. */
  public A185542() {
    super(1);
  }

  @Override
  protected Z evalCR(final long n) {
    final Z m = CR.valueOf(n).pow(5).sqrt().floor();
    return m.multiply(m.add(1)).divide2();
  }

}
