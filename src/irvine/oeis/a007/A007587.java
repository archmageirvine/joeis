package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007587 12-gonal (or dodecagonal) pyramidal numbers: <code>n(n+1)(10n-7)/6</code>.
 * @author Sean A. Irvine
 */
public class A007587 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).multiply(10 * mN - 17).divide(6);
  }
}
