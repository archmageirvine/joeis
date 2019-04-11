package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010806 18th powers: <code>a(n) = n^18</code>.
 * @author Sean A. Irvine
 */
public class A010806 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(18);
  }
}
