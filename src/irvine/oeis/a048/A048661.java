package irvine.oeis.a048;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048661 Number of n-digit dihedral primes for which the 4 numbers (n, n upside-down, n in a mirror, n upside-down and mirrored) are distinct.
 * @author Sean A. Irvine
 */
public class A048661 extends Sequence1 {

  // Based on A134996

  private static final String NATURAL = "01258";
  private static final String MIRROR = "01528";
  private long mN = 0;
  private long mLim = 2;

  protected long step() {
    final TreeSet<Z> seen = new TreeSet<>();
    long cnt = 0;
    mLim *= 5;
    long n = mLim / 2;
    while (n != mLim) {
      long m = n;
      final StringBuilder natural = new StringBuilder();
      final StringBuilder mirror = new StringBuilder();
      natural.append('1');
      mirror.append('1');
      while (m != 0) {
        natural.append(NATURAL.charAt((int) (m % 5)));
        mirror.append(MIRROR.charAt((int) (m % 5)));
        m /= 5;
      }
      final Z nat = new Z(natural);
      if (!seen.contains(nat)) {
        final Z mir, natr, mirr;
        if (nat.isProbablePrime()
          && (mir = new Z(mirror)).isProbablePrime()
          && (natr = new Z(natural.reverse())).isProbablePrime()
          && (mirr = new Z(mirror.reverse())).isProbablePrime()) {
          if (seen.add(nat) && seen.add(mir) && seen.add(natr) && seen.add(mirr)) {
            // i.e. all 4 were new and distinct
            ++cnt;
          }
        }
      }
      ++n;
    }
    return cnt;
  }

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.ZERO;
    }
    return Z.valueOf(step()).multiply(4);
  }
}
