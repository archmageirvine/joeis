package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005820.
 * @author Sean A. Irvine
 */
public class A005820 implements Sequence {

  // This sequence is probably finite and complete, and this implementation does not
  // search beyond the known values.

  private static final long[] KNOWN_TERMS = {120, 672, 523776, 459818240, 1476304896, 51001180160L};
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == KNOWN_TERMS.length) {
      throw new UnsupportedOperationException();
    }
    return Z.valueOf(KNOWN_TERMS[mN]);
  }
}
