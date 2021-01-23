package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010807 19th powers: a(n) = n^19.
 * @author Sean A. Irvine
 */
public class A010807 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(19);
  }
}
