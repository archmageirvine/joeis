package irvine.oeis.a380;
// Generated by gen_seq4.pl 2025-06-16.ack/lambdan at 2025-06-16 21:55

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A380824 Area of the unique primitive Pythagorean triple whose inradius is A000032(n) and such that its long leg and its hypotenuse are consecutive natural numbers.
 * @author Georg Fischer
 */
public class A380824 extends LambdaSequence {

  /** Construct the sequence. */
  public A380824() {
    super(0, n -> Functions.LUCAS.z(n).multiply(Functions.LUCAS.z(n).add(1)).multiply(Z.TWO.multiply(Functions.LUCAS.z(n)).add(1)));
  }
}
