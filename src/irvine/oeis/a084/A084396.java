package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084396 a(1) = 1; then numbers in increasing order such that the n-th partial concatenation is divisible by n.
 * @author Sean A. Irvine
 */
public class A084396 extends Sequence1 {

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
        return Z.valueOf(mM);
      }
    }
  }
}
