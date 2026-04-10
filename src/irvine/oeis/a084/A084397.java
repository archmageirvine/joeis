package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084397 a(n) = n-th partial concatenation of A084396(n) divided by n.
 * @author Sean A. Irvine
 */
public class A084397 extends Sequence1 {

  private String mS = "";
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      final String t = mS + ++mM;
      if (new Z(t).mod(mN) == 0) {
        mS = t;
        return new Z(mS).divide(mN);
      }
    }
  }
}
