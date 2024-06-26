package irvine.oeis.a173;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-27 20:43

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A173673 a(2k) = floor(F(k)/2), a(2k+1) = ceiling(F(k)/2), where F = A000045 is the Fibonacci sequence.
 * a(n)=(fibonacci(n\2)+n%2)\2
 * @author Georg Fischer
 */
public class A173673 extends LambdaSequence {

  /** Construct the sequence. */
  public A173673() {
    super(0, n -> Functions.FIBONACCI.z(n / 2).add(Z.valueOf(n).mod(Z.TWO)).divide(Z.TWO));
  }
}
