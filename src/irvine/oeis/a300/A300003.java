package irvine.oeis.a300;

import irvine.math.z.Z;
import irvine.oeis.a007.A007975;

/**
 * A300003.
 * @author Sean A. Irvine
 */
public class A300003 extends A007975 {

  private int mM = 0;

  @Override
  protected int start() {
    return -1;
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      // Start the next row
      init();
      mM = 0;
    } else {
      step();
    }
    return Z.valueOf(mPrev.size());
  }
}
