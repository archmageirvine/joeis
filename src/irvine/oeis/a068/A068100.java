package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A068100 a(1) = 1; a(n+1) = n!*Sum_{k|n} a(k)/k!.
 * @author Sean A. Irvine
 */
public class A068100 extends CachedSequence {


  /** Construct the sequence. */
  public A068100() {
    super(1, Integer.class, (self, n) -> n == 1
      ? Z.ONE
      : Integers.SINGLETON.sumdiv(n - 1, d -> self.a(d).multiply(Functions.FACTORIAL.z(n - 1).divide(Functions.FACTORIAL.z(d)))));
  }
}

