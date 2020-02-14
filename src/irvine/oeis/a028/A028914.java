package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028914 Divide <code>A028913</code> by 2.
 * @author Sean A. Irvine
 */
public class A028914 extends A028913 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
