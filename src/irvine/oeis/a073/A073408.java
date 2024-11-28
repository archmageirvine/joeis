package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A073408.
 * @author Sean A. Irvine
 */
public class A073408 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    long cnt = 0;
    long m = ++mN;
    do {
      m = Functions.COTOTIENT.l(m);
      ++cnt;
    } while (mN % m != 0);
    return Z.valueOf(cnt);
  }
}

