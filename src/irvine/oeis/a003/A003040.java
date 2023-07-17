package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a060.A060240;

/**
 * A003040 Highest degree of an irreducible representation of symmetric group S_n of degree n.
 * @author Sean A. Irvine
 */
public class A003040 extends A060240 {

  /** Construct the sequence. */
  public A003040() {
    super(1);
  }

  private int mN = 0;

  @Override
  public Z next() {
    Z max = Z.ZERO;
    for (final Z r : representations(++mN)) {
      max = max.max(r);
    }
    return max;
  }
}
