package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010804 16th powers: <code>a(n) = n^16</code>.
 * @author Sean A. Irvine
 */
public class A010804 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(16);
  }
}
