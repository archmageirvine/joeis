package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013660 Elementary catastrophes on n-dimensional manifold (the next term is <code>infinite)</code>.
 * @author Sean A. Irvine
 */
public class A013660 implements Sequence {

  private static final int[] TERMS = {1, 2, 5, 7, 11};
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < TERMS.length) {
      return Z.valueOf(TERMS[mN]);
    }
    throw new UnsupportedOperationException("infinite");
  }
}
