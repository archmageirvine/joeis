package irvine.oeis.a075;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075621 Group the natural numbers so that the n-th group contains n numbers whose concatenation is divisible by n: (1), (2, 4), (3, 5, 7), (6, 8, 9, 12), (10, 11, 13, 14, 15), (16, 17, 18, 19, 20, 24), ... Sequence gives numbers formed by the concatenation.
 * @author Sean A. Irvine
 */
public class A075621 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private long mM = 0;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    // All but last number are simply the smallest unused numbers
    for (long k = 1; k < mN; ++k) {
      while (mUsed.remove(++mM)) {
        // do nothing
      }
      sb.append(mM);
    }
    // Find last number
    long j = mM;
    while (true) {
      final Z t = new Z(sb.toString() + ++j);
      if (t.mod(mN) == 0 && mUsed.add(j)) {
        return t;
      }
    }
  }
}
