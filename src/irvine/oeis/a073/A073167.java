package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A073167 The (n!)-th composite number.
 * @author Sean A. Irvine
 */
public class A073167 extends A002808 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    final long f = Functions.FACTORIAL.l(++mN);
    while (mM + 1 < f) {
      ++mM;
      super.next();
    }
    ++mM;
    return super.next();
  }
}
