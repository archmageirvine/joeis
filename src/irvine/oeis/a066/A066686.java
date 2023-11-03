package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066686 Array T(i,j) read by antidiagonals, where T(i,j) is the concatenation of i and j (1&lt;=i, 1&lt;=j).
 * @author Sean A. Irvine
 */
public class A066686 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return new Z(String.valueOf(mM + 1) + (mN - mM));
  }
}
