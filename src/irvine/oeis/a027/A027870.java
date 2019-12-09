package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027870 Number of zeros in <code>2^n</code>.
 * @author Sean A. Irvine
 */
public class A027870 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(A027869.count(Z.ONE.shiftLeft(++mN)));
  }
}
