package irvine.oeis.a071;
// Generated by gen_seq4.pl 2024-04-24/lambdan at 2024-04-24 18:19

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A071906 Sum of digits of 2^n (mod 2).
 * @author Georg Fischer
 */
public class A071906 extends LambdaSequence {

  /** Construct the sequence. */
  public A071906() {
    super(0, n -> Functions.DIGIT_SUM.z(Z.TWO.pow(n)).modZ(2));
  }
}
