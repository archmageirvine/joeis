package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a002.A002884;

/**
 * A028365.
 * @author Sean A. Irvine
 */
public class A028365 extends A002884 {

  private int mN = -1;

  @Override
  public Z next() {
    return super.next().shiftLeft(++mN);
  }
}

