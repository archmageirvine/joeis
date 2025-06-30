package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006577;

/**
 * A078421 Least positive integer solution k to h(k) = n h(k-1), where h(n) is the length of n, f(n), f(f(n)), ...., 1 in the Collatz (or 3x + 1) problem. (The earliest "1" is meant.).
 * @author Sean A. Irvine
 */
public class A078421 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence seq = new A006577();
    Z a = seq.next();
    long m = 1;
    while (true) {
      ++m;
      final Z t = a;
      a = seq.next();
      if (t.multiply(mN).add(mN - 1).equals(a)) {
        return Z.valueOf(m);
      }
    }
  }
}

