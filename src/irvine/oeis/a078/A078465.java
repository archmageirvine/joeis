package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A078465 Primonacci numbers: a(n)=a(n-2)+a(n-3)+a(n-5)+a(n-7)+a(n-11)+...+a(n-p(k))+... until n &lt;= p(k), where p(k) is the k-th prime. a(1)=a(2)=1.
 * @author Sean A. Irvine
 */
public class A078465 extends CachedSequence {

  /** Construct the sequence. */
  public A078465() {
    super(1, Integer.class, (self, n) -> {
      if (n <= 2) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int p = 2; p < n; p = Functions.NEXT_PRIME.i(p)) {
        sum = sum.add(self.a(n - p));
      }
      return sum;
    });
  }
}

