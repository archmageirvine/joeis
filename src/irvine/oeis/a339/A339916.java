package irvine.oeis.a339;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-24 21:51

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A339916 The sum of 2^((d-1)/2) over all divisors of 2n+1.
 * a(n) = sumdiv(2*n+1,d,2^((d-1)/2));
 * @author Georg Fischer
 */
public class A339916 extends LambdaSequence {

  /** Construct the sequence. */
  public A339916() {
    super(0, n -> Integers.SINGLETON.sumdiv(2L * n + 1, d -> Z.TWO.pow(Z.valueOf(d - 1).divide(Z.TWO))));
  }
}
