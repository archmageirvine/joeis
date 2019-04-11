package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010810 22nd powers: <code>a(n) = n^22</code>.
 * @author Sean A. Irvine
 */
public class A010810 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(22);
  }
}
