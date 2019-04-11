package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010813 25th powers: <code>a(n) = n^25</code>.
 * @author Sean A. Irvine
 */
public class A010813 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(25);
  }
}
