package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073401.
 * @author Sean A. Irvine
 */
public class A073407 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    long m = ++mN;
    do {
      m = Functions.PHI.l(m);
      ++cnt;
    } while (mN % m != 0);
    return Z.valueOf(cnt);
  }
}

