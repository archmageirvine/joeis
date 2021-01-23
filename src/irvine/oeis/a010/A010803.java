package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010803 15th powers: a(n) = n^15.
 * @author Sean A. Irvine
 */
public class A010803 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(15);
  }
}
