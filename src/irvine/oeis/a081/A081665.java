package irvine.oeis.a081;

import irvine.math.z.Z;

/**
 * A081665 Smallest integer q for which there exists a fraction p/q containing n in its decimal expansion.
 * @author Sean A. Irvine
 */
public class A081665 extends A081664 {

  @Override
  protected Z select(final long p, final long q) {
    return Z.valueOf(q);
  }
}
