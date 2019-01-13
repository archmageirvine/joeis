package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014206.
 * @author Sean A. Irvine
 */
public class A014206 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).square().add(mN + 2);
  }
}
