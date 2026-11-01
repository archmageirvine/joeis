package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A087165 a(n)=1 when n == 1 (mod 4), otherwise a(n) = a(n - ceiling(n/4)) + 1. Removing all the 1's results in the original sequence with every term incremented by 1.
 * @author Sean A. Irvine
 */
public class A087165 extends CachedSequence {

  /** Construct the sequence. */
  public A087165() {
    super(1, Long.class, (self, n) -> (n & 3) == 1 ? Z.ONE : self.a(n - (n + 3) / 4).add(1));
  }
}
