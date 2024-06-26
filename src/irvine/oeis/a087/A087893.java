package irvine.oeis.a087;
// Generated by gen_seq4.pl 2024-05-24/lambdan at 2024-05-24 21:50

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A087893 Number of numbers m satisfying 1 &lt; m &lt; n such that m^2 == m (mod n).
 * @author Georg Fischer
 */
public class A087893 extends LambdaSequence {

  /** Construct the sequence. */
  public A087893() {
    super(1, n -> (n <= 1) ? Z.ZERO : Z.TWO.pow(Functions.OMEGA.i(n)).subtract(2));
  }
}
