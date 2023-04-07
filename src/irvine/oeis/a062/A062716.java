package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a034.A034841;

/**
 * A062716 Number of arrangements of 1,2,..,n*n in an n X n matrix such that each row is increasing or decreasing.
 * @author Sean A. Irvine
 */
public class A062716 extends A034841 {

  private int mN = -1;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    return super.next().shiftLeft(++mN);
  }
}

