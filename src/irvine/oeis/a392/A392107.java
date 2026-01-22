package irvine.oeis.a392;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a039.A039701;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A392107 a(n) = position of first occurrence of the n-th binary word (using letters 1 and 2 as in A392106) in the sequence of residues modulo 3 of the primes.
 * @author Sean A. Irvine
 */
public class A392107 extends Sequence1 {

  private final Sequence mMod3 = new A039701();
  private final Bumper mBumper = BumperFactory.range(1, 2);
  private final StringBuilder mS = new StringBuilder();
  private int[] mA = {};

  private boolean match(final StringBuilder s, final StringBuilder t) {
    if (s.length() < t.length()) {
      return false;
    }
    for (int k = 1; k <= t.length(); ++k) {
      if (t.charAt(t.length() - k) != s.charAt(s.length() - k)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (!mBumper.bump(mA)) {
      mA = new int[mA.length + 1];
      Arrays.fill(mA, 1);
    }
    final StringBuilder sb = new StringBuilder();
    for (final int v : mA) {
      sb.append(v);
    }
    final String s = sb.toString();
    final int t = mS.indexOf(s);
    if (t >= 0) {
      return Z.valueOf(t + 1);
    }
    while (true) {
      mS.append(mMod3.next());
      if (match(mS, sb)) {
        return Z.valueOf(mS.length() - s.length() + 1);
      }
    }
  }
}
