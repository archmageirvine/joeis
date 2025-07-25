package irvine.oeis.a383;
// Generated by gen_seq4.pl 2025-06-16.ack/lambdan at 2025-06-16 21:55

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A383957 Sum of the legs of the unique primitive Pythagorean triple whose inradius is A000108(n) and such that its long leg and its hypotenuse are consecutive natural numbers.
 * @author Georg Fischer
 */
public class A383957 extends LambdaSequence {

  /** Construct the sequence. */
  public A383957() {
    super(0, n -> Z.TWO.multiply((Functions.CATALAN.z(n)).square()).add(Z.FOUR.multiply(Functions.CATALAN.z(n))).add(1));
  }
}
