package irvine.oeis.a102;
// manually knest at 2023-03-12

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a014.A014612;

/**
 * A102304 Sum of factors of numbers having exactly three prime factors.
 * @author Georg Fischer
 */
public class A102304 extends Sequence0 {

  private final A014612 mSeq = new A014612();

  @Override
  public Z next() {
    return Functions.SOPFR.z(mSeq.next());
  }
}
