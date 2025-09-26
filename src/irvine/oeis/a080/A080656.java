package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A080656 Order of group of n X n X n Rubik cube, under assumptions not-s, m, not-i.
 * @author Sean A. Irvine
 */
public class A080656 extends CachedSequence {

  /** Construct the sequence. */
  public A080656() {
    super(1, Integer.class, (self, n) -> {
      if (n <= 1) {
        return Z.ONE;
      } else if (n == 2) {
        return Z.valueOf(3674160);
      } else if (n == 3) {
        return new Z("43252003274489856000");
      } else {
        return self.a(n - 2).multiply(Functions.FACTORIAL.z(24)).multiply(Functions.FACTORIAL.z(24).divide2().pow(n - 3));
      }
    });
  }
}
