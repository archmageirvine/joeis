package irvine.oeis.a109;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-13 11:40

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A109587 a(n)=[prime(n+2)-2*prime(n+1)-prime(n)]^(n+1), where prime(k) is the k-th prime.
 * a(n)=(prime(n+2)-2*prime(n+1)-prime(n))^(n+1)
 * @author Georg Fischer
 */
public class A109587 extends LambdaSequence {

  /** Construct the sequence. */
  public A109587() {
    super(1, n -> Functions.PRIME.z(n + 2).subtract(Z.TWO.multiply(Functions.PRIME.z(n + 1))).subtract(Functions.PRIME.z(n)).pow(Z.valueOf(n + 1)));
  }
}
