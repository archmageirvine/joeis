package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000560 Number of ways of folding a strip of n labeled stamps.
 * @author Sean A. Irvine
 */
public class A000560 extends A000682 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
