package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000326.
 * @author Sean A. Irvine
 */
public class A000326 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(3 * mN - 1).divide2();
  }
}

