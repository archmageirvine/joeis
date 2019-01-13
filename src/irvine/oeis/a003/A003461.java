package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003461.
 * @author Sean A. Irvine
 */
public class A003461 implements Sequence {

  private int mN = -2;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).multiply(3).add(4);
  }
}
