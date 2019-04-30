package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000831 Expansion of e.g.f. <code>(1 + tan(x))/(1 - tan(x))</code>.
 * @author Sean A. Irvine
 */
public class A000831 extends A000111 {

  @Override
  public Z next() {
    return super.next().shiftLeft(mN);
  }
}

