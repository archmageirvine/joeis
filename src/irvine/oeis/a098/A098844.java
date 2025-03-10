package irvine.oeis.a098;
// Generated by gen_seq4.pl 2024-10-15.ack/lambdan at 2024-10-15 22:29

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A098844 a(1)=1, a(n) = n*a(floor(n/2)).
 * @author Georg Fischer
 */
public class A098844 extends LambdaSequence {

  /** Construct the sequence. */
  public A098844() {
    super(1, n -> Integers.SINGLETON.product(0, Functions.DIGIT_LENGTH.i(2, n) - 1, k -> Z.valueOf(n).divide(Z.TWO.pow(k))));
  }
}
