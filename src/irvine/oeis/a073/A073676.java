package irvine.oeis.a073;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073676 Rearrangement of odd numbers not divisible by 5 such that every right concatenation of terms is a prime.
 * @author Sean A. Irvine
 */
public class A073676 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private final StringBuilder mConcat = new StringBuilder();

  @Override
  public Z next() {
    long k = -1;
    while (true) {
      k += 2;
      if (k % 5 != 0 && !mUsed.contains(k)) {
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
