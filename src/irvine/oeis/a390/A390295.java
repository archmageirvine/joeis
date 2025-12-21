package irvine.oeis.a390;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a014.A014574;

/**
 * A390295 Average k of twin prime pairs such that gcd(d^2 - 4, k) = 1 for only one divisor d of k.
 * @author Sean A. Irvine
 */
public class A390295 extends FilterSequence {

  /** Construct the sequence. */
  public A390295() {
    super(1, new A014574(), k -> {
      int cnt = 0;
      for (final Z d : Jaguar.factor(k).divisors()) {
        if (Functions.GCD.z(d.square().subtract(4), k).isOne() && ++cnt > 1) {
          return false;
        }
      }
      return cnt == 1;
    });
  }
}
