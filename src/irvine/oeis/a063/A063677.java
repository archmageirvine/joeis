package irvine.oeis.a063;

import irvine.math.z.Z;

/**
 * A063677 Size of largest subset of {A063676(1), ......., A063676(n)} with an integer arithmetic mean.
 * @author Sean A. Irvine
 */
public class A063677 extends A063676 {

  {
    super.next();
  }

  @Override
  protected Z select(final Z v, final Z b) {
    return Z.valueOf(b.bitCount());
  }
}
