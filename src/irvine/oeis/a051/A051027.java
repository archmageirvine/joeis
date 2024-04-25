package irvine.oeis.a051;
// manually 2024-04-25

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A051027 a(n) = sigma(sigma(n)) = sum of the divisors of the sum of the divisors of n.
 * Formula: <code>a(n) = A000203(A000203(n)).</code>
 * @author Georg Fischer
 */
public class A051027 extends LambdaSequence {

  /** Construct the sequence. */
  public A051027() {
    super(1, n -> Functions.SIGMA.z(Functions.SIGMA.z(n)));
  }

}
