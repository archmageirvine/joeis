package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A067014 a(1)=1 and a(n+1)=phi(a(n))+a(phi(n)) for n&gt;0.
 * @author Sean A. Irvine
 */
public class A067014 extends CachedSequence {

  /** Construct the sequence. */
  public A067014() {
    super(1, Integer.class, (self, k) -> k == 1 ? Z.ONE : Functions.PHI.z(self.a(k - 1)).add(self.a(Functions.PHI.z(k - 1L))));
  }
}
