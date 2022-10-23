package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A010783 Triangle of numbers floor(n/(n-k)).
 * @author Sean A. Irvine
 */
public class A010783 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (--mM <= 0) {
      mM = ++mN;
    }
    return Z.valueOf(mN / mM);
  }
}
