package irvine.oeis.a079;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-26 21:16

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A079186 Number of non-anti-commutative closed binary operations on a set of order n.
 * a(n) = n^(n^2) - (n^n)*((n^2-n)^((n^2-n)/2))
 * @author Georg Fischer
 */
public class A079186 extends LambdaSequence {

  /** Construct the sequence. */
  public A079186() {
    super(0, n -> Z.valueOf(n).pow((long) n * n).subtract(Z.valueOf(n).pow(n).multiply(Z.valueOf((long) n * n - n).pow(Z.valueOf((long) n * n - n).divide(Z.TWO)))));
  }
}
