package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006577;

/**
 * A078438 a(n) = least positive integer solution k to h(k) = h(k-1)+h(k-2)+...+h(k-n), where h(n) is the length of n, f(n), f(f(n)), ...., 1 in the Collatz (or 3x + 1) problem. (The earliest "1" is meant.).
 * @author Sean A. Irvine
 */
public class A078438 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final DirectSequence seq = new A006577();
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(seq.a(k));
    }
    int m = mN;
    while (true) {
      ++m;
      final Z t = seq.a(m);
      if (t.equals(sum.add(mN - 1))) {
        return Z.valueOf(m);
      }
      sum = sum.subtract(seq.a(m - mN)).add(t);
    }
  }
}

