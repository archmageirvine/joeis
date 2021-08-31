package irvine.oeis.a336;
// manually floor at 2021-08-31 14:40

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A336018 a(n) = floor(frac(log_2(n))*n), where frac denotes the fractional part.
 * @author Georg Fischer
 */
public class A336018 extends FloorSequence {
	
  /** Construct the sequence */
  public A336018() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return mN <= 2 ? Z.ZERO : CR.valueOf(n).log().divide(CR.TWO.log()).frac().multiply(CR.valueOf(n)).floor();
  }

}
