package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010802 14th powers: a(n) = n^14.
 * @author Sean A. Irvine
 */
public class A010802 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(14);
  }
}
