package irvine.oeis.a057;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057878 Primes with 2 distinct digits that remain prime (no leading zeros allowed) after deleting all occurrences of its digits d.
 * @author Sean A. Irvine
 */
public class A057878 extends Sequence1 {

  // Digits 0, 4, 6, 8, 9 can never occur.
  // Digits 2, 3, 5, 7 can appear at most once.

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.valueOf(12));
    mA.add(Z.valueOf(21));
    mA.add(Z.valueOf(32));
    mA.add(Z.valueOf(23));
    mA.add(Z.valueOf(72));
    mA.add(Z.valueOf(27));
    mA.add(Z.valueOf(15));
    mA.add(Z.valueOf(51));
    mA.add(Z.valueOf(35));
    mA.add(Z.valueOf(53));
    mA.add(Z.valueOf(75));
    mA.add(Z.valueOf(57));
    mA.add(Z.valueOf(13));
    mA.add(Z.valueOf(31));
    mA.add(Z.valueOf(73));
    mA.add(Z.valueOf(37));
    mA.add(Z.valueOf(71));
    mA.add(Z.valueOf(17));
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.pollFirst();
      final String s = t.toString();
      if (s.contains("1")) {
        mA.add(t.multiply(10).add(1));
        mA.add(new Z("1" + s));
      }
      if (t.isProbablePrime() && A057876.is(s)) {
        return t;
      }
    }
  }
}

