package irvine.oeis.a075;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075625 Sums of terms of groups in A075621.
 * @author Sean A. Irvine
 */
public class A075625 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private long mM = 0;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    final StringBuilder sb = new StringBuilder();
    // All but last number are simply the smallest unused numbers
    for (long k = 1; k < mN; ++k) {
      while (mUsed.remove(++mM)) {
        // do nothing
      }
      sb.append(mM);
      sum += mM;
    }
    // Find last number
    long j = mM;
    while (true) {
      final Z t = new Z(sb.toString() + ++j);
      if (t.mod(mN) == 0 && mUsed.add(j)) {
        return Z.valueOf(sum + j);
      }
    }
  }
}
