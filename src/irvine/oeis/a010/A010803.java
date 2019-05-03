package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010803 <code>15th</code> powers: <code>a(n) = n^15</code>.
 * @author Sean A. Irvine
 */
public class A010803 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(15);
  }
}
