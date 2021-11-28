package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052756 E.g.f.: (-1/3)*LambertW(-3*x).
 * @author Sean A. Irvine
 */
public class A052756 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(3L * ++mN).pow(mN - 1);
  }
}
