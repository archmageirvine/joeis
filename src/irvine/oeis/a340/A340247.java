package irvine.oeis.a340;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A340247 Sum of the third largest parts r of the partitions of n into 4 parts q,r,s,t such that 1 &lt;= q &lt;= r &lt;= s &lt;= t and q + r + s &gt; t.
 * a(n)=sum(k=1,floor(n/4),sum(j=k,floor((n-k)/3),sum(i=j,floor((n-j-k)/2),j*sign(floor((i+k+j)/(n-i-j-k+1))))))
 * @author Georg Fischer
 */
public class A340247 extends LambdaSequence {

  /** Construct the sequence. */
  public A340247() {
    super(1, n -> Integers.SINGLETON.sum(1, n / 4, k -> Integers.SINGLETON.sum(k, (n - k) / 3, j -> Integers.SINGLETON.sum(j, (n - j - k) / 2, i -> Z.valueOf(j).multiply(Z.valueOf(i + k + j).divide(Z.valueOf(n - i - j - k + 1)).signum())))));
  }
}
