package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080608
 * @author Sean A. Irvine
 */
public class A080611 extends Sequence1 {

  // Only good for a few terms.

  private int mN = 0;

  @Override
  public Z next() {
    final Z pr = Functions.PRIMORIAL_COUNT.z(++mN);
    long k = 0;
    while (true) {
      final Z t = pr.multiply(++k);
      final Z r = t.root(3);
      if (r.multiply(r.add(1)).multiply(r.add(2)).equals(t)) {
        return r.add(1);
      }
    }
  }
}
