package irvine.oeis.a387;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A387789 a(1) = 0, a(2*n) = a(n)+1, a(2*n+1) = floor((a(n)+a(n+1))/2) for n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A387789 extends CachedSequence {

  /** Construct the sequence. */
  public A387789() {
    super(1, Integer.class, (self, n) -> {
      if (n <= 1) {
        return Z.ZERO;
      }
      if ((n & 1) == 0) {
        return self.a(n / 2).add(1);
      } else {
        return self.a(n / 2).add(self.a(n / 2 + 1)).divide2();
      }
    });
  }
}

