package irvine.oeis.a062;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062400 Smallest multiple of n with property that digits are even and each digit is two more (mod 10) than the previous digit; or 0 if no such multiple exists.
 * @author Sean A. Irvine
 */
public class A062400 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final TreeSet<Z> t = new TreeSet<>();
    for (int k = 2; k < 10; k += 2) {
      t.add(Z.valueOf(k));
    }
    long pc = -1;
    // Heuristic, assume number of digits in solution is less than n.
    // *4 because there are 4 numbers with a given number of digits to consider.
    // This seemed more workable that carefully examining the residues to periodic repeats.
    final long lim = 4 * mN;
    while (true) {
      final Z a = t.pollFirst();
      final long r = a.mod(mN);
      if (r == 0) {
        return a;
      }
      if (++pc > lim) {
        return Z.ZERO;
      }
      t.add(a.multiply(10).add((a.mod(10) + 2) % 10));
    }
  }
}
