package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A078479 a(1)=1, a(n+1)=a(spf(n))+a(gpf(n)), where spf(n) and gpf(n) are the smallest and greatest prime factors of n (A020639, A006530).
 * @author Sean A. Irvine
 */
public class A078479 extends CachedSequence {

  /** Construct the sequence. */
  public A078479() {
    super(1, Integer.class, (self, n) -> n == 1 ? Z.ONE : self.a(Functions.LPF.z(n - 1)).add(self.a(Functions.GPF.z(n - 1))));
  }
}

