package irvine.oeis.a224;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-27 20:43

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A224746 a(n) = (Product_{d=1..n-1} (2^d-1)) mod (2^n-1).
 * a(n) = prod(d=1,n-1,2^d-1) % (2^n-1)
 * @author Georg Fischer
 */
public class A224746 extends LambdaSequence {

  /** Construct the sequence. */
  public A224746() {
    super(1, n -> Integers.SINGLETON.product(1, n - 1, d -> Z.ONE.shiftLeft(d).subtract(Z.ONE)).mod(Z.ONE.shiftLeft(n).subtract(Z.ONE)));
  }
}
