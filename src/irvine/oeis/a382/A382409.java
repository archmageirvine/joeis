package irvine.oeis.a382;
// Generated by gen_seq4.pl 2025-06-16.ack/lambdan at 2025-06-16 21:55

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A382409 Semiperimeter of the unique primitive Pythagorean triple (a,b,c) such that (a-b+c)/2 is A000032(n) and such that its long leg and its hypotenuse are consecutive natural numbers.
 * @author Georg Fischer
 */
public class A382409 extends LambdaSequence {

  /** Construct the sequence. */
  public A382409() {
    super(0, n -> Functions.LUCAS.z(n).multiply(Z.TWO.multiply(Functions.LUCAS.z(n)).subtract(1)));
  }
}
