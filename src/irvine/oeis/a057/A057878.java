package irvine.oeis.a057;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A057878 Primes with 2 distinct digits that remain prime (no leading zeros allowed) after deleting all occurrences of its digits d.
 * @author Sean A. Irvine
 */
public class A057878 implements Sequence {

  // Digits 0, 4, 6, 8, 9 can never occur.
  // Digits 2, 5 can appear at most once.
  // Therefore forms are {1,3,7}* {2,5} {1,3,7}*

  private final TreeMap<Z, Pair<Integer, Integer>> mA = new TreeMap<>();
  {
    mA.put(Z.valueOf(12), new Pair<>(2, 1));
    mA.put(Z.valueOf(21), new Pair<>(2, 1));
    mA.put(Z.valueOf(32), new Pair<>(2, 3));
    mA.put(Z.valueOf(23), new Pair<>(2, 3));
    mA.put(Z.valueOf(72), new Pair<>(2, 7));
    mA.put(Z.valueOf(27), new Pair<>(2, 7));
    mA.put(Z.valueOf(15), new Pair<>(5, 1));
    mA.put(Z.valueOf(51), new Pair<>(5, 1));
    mA.put(Z.valueOf(35), new Pair<>(5, 3));
    mA.put(Z.valueOf(53), new Pair<>(5, 3));
    mA.put(Z.valueOf(75), new Pair<>(5, 7));
    mA.put(Z.valueOf(57), new Pair<>(5, 7));
    mA.put(Z.valueOf(13), new Pair<>(3, 1));
    mA.put(Z.valueOf(31), new Pair<>(3, 1));
    mA.put(Z.valueOf(73), new Pair<>(3, 7));
    mA.put(Z.valueOf(37), new Pair<>(3, 7));
    mA.put(Z.valueOf(71), new Pair<>(1, 7));
    mA.put(Z.valueOf(17), new Pair<>(1, 7));
  }

  @Override
  public Z next() {
    while (true) {
      final Map.Entry<Z, Pair<Integer, Integer>> e = mA.pollFirstEntry();
      final Z t = e.getKey();
      final String s = t.toString();
      final Pair<Integer, Integer> v = e.getValue();
      final int left = v.left();
      final int right = v.right();
      if (left != 2 && left != 5) {
        mA.put(t.multiply(10).add(left), v);
        mA.put(new Z(left + s), v);
      }
      mA.put(t.multiply(10).add(right), v);
      mA.put(new Z(right + s), v);
      if (t.isProbablePrime() && A057876.is(s)) {
        return t;
      }
    }
  }
}

