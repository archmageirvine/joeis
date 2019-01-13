package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013945.
 * @author Sean A. Irvine
 */
public class A013945 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return (++mN & 1) == 0 ? Z.valueOf(mN / 2).square().add(1) : Z.valueOf(mN).square().add(2);
  }
}
