package irvine.oeis.a338;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-27 21:29

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A338997 Number of (i,j,k) in {1,2,...,n}^3 such that gcd(n,i) = gcd(n,j) = gcd(n,k).
 * a(n)=sum(k=1,n,eulerphi(n/gcd(k,n))^2)
 * @author Georg Fischer
 */
public class A338997 extends LambdaSequence {

  /** Construct the sequence. */
  public A338997() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Functions.PHI.z(Z.valueOf(n).divide(Z.valueOf(k).gcd(n))).square()));
  }
}
