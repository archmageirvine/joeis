package irvine.oeis.a384;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007504;

/**
 * A384644 a(n) is the least k such that {A007504(1), A007504(2), ..., A007504(k)} mod n = {0,...,n-1}.
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
