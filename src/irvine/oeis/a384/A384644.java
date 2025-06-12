package irvine.oeis.a384;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007504;

/**
 * A384644 allocated for Charles L. Hohn.
 * @author Sean A. Irvine
 */
public class A384644 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence seq = new A007504().skip();
    final HashSet<Long> seen = new HashSet<>();
    long k = 0;
    while (seen.size() != mN) {
      seen.add(seq.next().mod(mN));
      ++k;
    }
    return Z.valueOf(k);
  }
}
