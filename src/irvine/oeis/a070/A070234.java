package irvine.oeis.a070;

import irvine.math.z.Z;

/**
 * A070224.
 * @author Sean A. Irvine
 */
public class A070234 extends A070231 {

  @Override
  protected Z select(final Z u, final Z v, final Z w) {
    return v;
  }
}

