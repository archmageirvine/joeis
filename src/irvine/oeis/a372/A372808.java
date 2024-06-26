package irvine.oeis.a372;
// Generated by gen_seq4.pl 2024-05-22/lambdan at 2024-05-22 22:35

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A372808 a(n) = sum of the digits (mod 5) of 5^n.
 * @author Georg Fischer
 */
public class A372808 extends LambdaSequence {

  /** Construct the sequence. */
  public A372808() {
    super(0, n -> Functions.DIGIT_SUM.z(new Z(Z.FIVE.pow(n).toString().replace('9', '4').replace('8', '3').replace('7', '2').replace('6', '1').replace('5', '0'))));
  }
}
