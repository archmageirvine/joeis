package irvine.oeis.a134;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A134996 Dihedral calculator primes: p, p upside down, p in a mirror, p upside-down-and-in-a-mirror are all primes.
 * @author Sean A. Irvine
 */
public class A134996 extends Sequence1 {

  private static final String NATURAL = "01258";
  private static final String MIRROR = "01528";
  protected final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.TWO);
    mA.add(Z.FIVE);
    mA.add(Z.valueOf(11));
  }

  private long mLim = 2;

  protected void step() {
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
      if (!mA.contains(nat)) {
        final Z mir, natr, mirr;
        if (nat.isProbablePrime()
          && (mir = new Z(mirror)).isProbablePrime()
          && (natr = new Z(natural.reverse())).isProbablePrime()
          && (mirr = new Z(mirror.reverse())).isProbablePrime()) {
          mA.add(nat);
          mA.add(mir);
          mA.add(natr);
          mA.add(mirr);
        }
      }
      ++n;
    }
  }

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      step();
    }
    return mA.pollFirst();
  }
}
