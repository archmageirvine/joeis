package irvine.oeis.a342;

import irvine.math.z.Z;

/**
 * A342848 Value of s in best integer approximation r^s to n! with s &gt;= r.
 * @author Sean A. Irvine
 */
public class A342848 extends A342847 {

  @Override
  protected Z select(final Z bestBase, final int bestE, final Z bestDelta) {
    return Z.valueOf(bestE);
  }
}

