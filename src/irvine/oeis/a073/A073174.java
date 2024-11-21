package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A073174 a(n) = a(phi(n-1)) + a(phi(n-2)), a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A073174 extends CachedSequence {

  /** Construct the sequence. */
  public A073174() {
    super(0, Integer.class, (self, n) -> n <= 1 ? Z.valueOf(n) : self.a(Functions.PHI.i(n - 1)).add(self.a(Functions.PHI.i(n - 2))));
  }
}
