package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010807 19th powers: a(n) = n^19.
 * @author Sean A. Irvine
 */
public class A010807 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(19);
  }
}
