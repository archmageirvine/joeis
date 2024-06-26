package irvine.oeis.a094;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A094422 Antidiagonal sums of array A094416.
 * a(n)=sum(k=1,n,sum(j=0,n,j!*(n-k+1)^j*stirl2(k,j)))
 * @author Georg Fischer
 */
public class A094422 extends LambdaSequence {

  /** Construct the sequence. */
  public A094422() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Integers.SINGLETON.sum(0, n, j -> Functions.FACTORIAL.z(j).multiply(Z.valueOf(n - k + 1).pow(j)).multiply(Functions.STIRLING2.z(k, j)))));
  }
}
