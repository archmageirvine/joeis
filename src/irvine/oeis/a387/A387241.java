package irvine.oeis.a387;

import irvine.math.z.Z;
import irvine.oeis.a385.A385240;

/**
 * A387241 a(n) is the number of 5 element sets of distinct integer sided rectangles that fill an n X n square.
 * @author Sean A. Irvine
 */
public class A387241 extends A385240 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 5);
  }
}

