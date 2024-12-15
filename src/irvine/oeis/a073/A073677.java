package irvine.oeis.a073;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073677 Rearrangement of the odd positive integers such that right concatenation of first 2m terms is prime, while a(2k+1) = 10k+5.
 * @author Sean A. Irvine
 */
public class A073677 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private final StringBuilder mConcat = new StringBuilder();
  private long mN = 0;

  @Override
  public Z next() {
    if ((++mN & 1) == 1) {
      final long m = 10 * (mN / 2) + 5;
      mConcat.append(m);
      mUsed.add(m);
      return Z.valueOf(m);
    }
    long k = 1;
    while (true) {
      k += 2;
      if (!mUsed.contains(k)) {
        final Z t = new Z(mConcat.toString() + k);
        if (t.isProbablePrime()) {
          mConcat.append(k);
          mUsed.add(k);
          return Z.valueOf(k);
        }
      }
    }
  }
}
