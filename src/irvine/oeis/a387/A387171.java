package irvine.oeis.a387;

import irvine.math.z.Z;
import irvine.oeis.a385.A385240;

/**
 * A387171 Number of 4 element sets of distinct integer sided rectangles that fill an n X n square.
 * @author Sean A. Irvine
 */
public class A387171 extends A385240 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 4);
  }
}

