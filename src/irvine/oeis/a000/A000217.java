package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000217.
 * @author Sean A. Irvine
 */
public class A000217 implements Sequence {

  protected long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mN + 1).divide2();
  }
}

