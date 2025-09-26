package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A080655 a(1) = a(2) = 1; for n &gt;= 2, a(n+1) = a(n) + a(j(n)) where j(m) = largest divisor of m that is &lt; m.
 * @author Sean A. Irvine
 */
public class A080655 extends CachedSequence {

  /** Construct the sequence. */
  public A080655() {
    super(1, Integer.class, (self, n) -> n <= 2 ? Z.ONE : self.a(n - 1).add(self.a((n - 1) / Functions.LPF.i(n - 1))));
  }
}
