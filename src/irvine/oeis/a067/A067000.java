package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A067000 a(1) = 1; a(n) = Sum (n+k)!a(k)/(2k)!, k = 1..n-1.
 * @author Sean A. Irvine
 */
public class A067000 extends CachedSequence {


  /** Construct the sequence. */
  public A067000() {
    super(1, Integer.class, (self, k) -> k == 1
      ? Z.ONE
      : Integers.SINGLETON.sum(1, k - 1, j -> self.a(j).multiply(Functions.FACTORIAL.z(k + j)).divide(Functions.FACTORIAL.z(2 * j))));
  }
}

