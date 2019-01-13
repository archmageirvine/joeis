package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006125.
 * @author Sean A. Irvine
 */
public class A006125 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(mN * ++mN / 2);
  }
}
