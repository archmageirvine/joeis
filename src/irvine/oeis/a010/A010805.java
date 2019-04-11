package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010805 17th powers: <code>a(n) = n^17</code>.
 * @author Sean A. Irvine
 */
public class A010805 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(17);
  }
}
