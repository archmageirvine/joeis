package irvine.oeis.a285;
// Generated by gen_seq4.pl 2024-07-07/arrlamb at 2024-07-07 23:13

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaArray;

/**
 * A285732 Square array A(n,k) read by antidiagonals, A(n,n) = -n, otherwise, if n &gt; k, A(n,k) = T(n-k,k), else A(n,k) = T(n,k-n), where T(n,k) is sequence A000027 considered as a two-dimensional table.
 * @author Georg Fischer
 */
public class A285732 extends LambdaArray {

  /** Construct the sequence. */
  public A285732() {
    super(1, 1, 1, -1, (n, k) -> (n.equals(k)) ? Z.valueOf(-n) : ((n > k) ? Functions.ONE_BASED_PAIRING.z(n - k, k) : Functions.ONE_BASED_PAIRING.z(n, k - n)));
  }
}
