package irvine.oeis.a164;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-27 21:29

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A164894 Base-10 representation of the binary string formed by appending 10, 100, 1000, 10000, ..., etc., to 1.
 * a(n)=sum(k=0,n-1,2^((n^2 + n)/2 - (k^2 + k)/2 - 1))
 * @author Georg Fischer
 */
public class A164894 extends LambdaSequence {

  /** Construct the sequence. */
  public A164894() {
    super(1, n -> Integers.SINGLETON.sum(0, n - 1, k -> Z.TWO.pow(Z.valueOf((long) n * n + n).divide(Z.TWO).subtract(Z.valueOf((long) k * k + k).divide(Z.TWO)).subtract(Z.ONE))));
  }
}
