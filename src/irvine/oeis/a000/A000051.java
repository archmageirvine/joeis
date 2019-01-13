package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000051.
 * @author Sean A. Irvine
 */
public class A000051 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    final Z r = mN.add(1);
    mN = mN.multiply2();
    return r;
  }
}

