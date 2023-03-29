package irvine.oeis.a062;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062399 Smallest multiple of n with property that each digit is one less (mod 10) than the previous digit; or 0 if no such multiple exists.
 * @author Sean A. Irvine
 */
public class A062399 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 10) {
      return Z.valueOf(mN);
    }
    final TreeSet<Z> t = new TreeSet<>();
    for (int k = 1; k < 10; ++k) {
      t.add(Z.valueOf(k));
    }
    long pc = -1;
    // Heuristic, assume number of digits in solution is less than n.
    // * 9 because there are 9 numbers with a given number of digits to consider.
    // This seemed more workable that carefully examining the residues to periodic repeats.
    long lim = 9 * mN;
    while (true) {
      final Z a = t.pollFirst();
      final long r = a.mod(mN);
      if (r == 0) {
        return a;
      }
      if (++pc > lim) {
        return Z.ZERO;
      }
      t.add(a.multiply(10).add((a.mod(10) + 9) % 10));
    }
  }
}
