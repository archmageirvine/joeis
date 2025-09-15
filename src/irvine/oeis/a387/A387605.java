package irvine.oeis.a387;

import irvine.math.z.Z;
import irvine.oeis.a384.A384724;

/**
 * A387605 a(n) is the number of 5 element sets of distinct integer sided strict rectangles that fill an n X n square.
 * @author Sean A. Irvine
 */
public class A387605 extends A384724 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 5);
  }
}

