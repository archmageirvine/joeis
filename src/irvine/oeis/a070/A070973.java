package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002379;

/**
 * A070964.
 * @author Sean A. Irvine
 */
public class A070973 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence seq = new A002379().skip();
    long k = 0;
    while (true) {
      ++k;
      if (seq.next().mod(mN) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
