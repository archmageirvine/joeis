package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A082410 a(1)=0. Thereafter, the sequence is constructed using the rule: for any k &gt;= 0, if a(1), a(2), ..., a(2^k+1) are known, the next 2^k terms are given as follows: a(2^k+1+i) = 1 - a(2^k+1-i) for 1 &lt;= i &lt;= 2^k.
 * @author Sean A. Irvine
 */
public class A082410 extends CachedSequence {

  /** Construct the sequence. */
  public A082410() {
    super(1, Integer.class, (self, n) -> {
      if (n == 1) {
        return Z.ZERO;
      }
      if ((n & 1) == 1) {
        return self.a(n / 2 + 1);
      }
      return (n & 3) == 2 ? Z.ONE : Z.ZERO;
    });
  }
}

