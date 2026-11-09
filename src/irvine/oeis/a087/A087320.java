package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001597;

/**
 * A087320 Smallest perfect power (at least a square) that is a multiple of n.
 * @author Sean A. Irvine
 */
public class A087320 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence s = new A001597();
    while (true) {
      final Z t = s.next();
      if (t.mod(mN) == 0) {
        return t;
      }
    }
  }
}

