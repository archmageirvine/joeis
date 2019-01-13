package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000330.
 * @author Sean A. Irvine
 */
public class A000330 implements Sequence {

  protected long mN = -1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.multiply(mN + 1).multiply(2 * mN + 1).divide(6);
  }
}

