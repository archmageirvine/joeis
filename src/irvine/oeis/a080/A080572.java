package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A080572 Number of ordered pairs (i,j), 0 &lt;= i,j &lt; n, for which (i &amp; j) is nonzero, where &amp; is the bitwise AND operator.
 * @author Sean A. Irvine
 */
public class A080572 extends CachedSequence {

  /** Construct the sequence. */
  public A080572() {
    super(0, Integer.class, (self, n) -> {
      if (n <= 1) {
        return Z.ZERO;
      }
      final int m = n / 2;
      if ((n & 1) == 0) {
        return self.a(m).multiply(3).add((long) m * m);
      }
      return self.a(m).add(self.a(m + 1).multiply2()).add((long) m * m - 1);
    });
  }
}

