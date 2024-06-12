package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070655.
 * @author Sean A. Irvine
 */
public class A070737 extends Sequence1 {

  private int mN = 0;
  private long mM = 3;

  private boolean is(final long m) {
    for (int t = mN; t > 0; --t) {
      if (!Functions.CYCLOTOMIC.z(t, m).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (!is(mM)) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
