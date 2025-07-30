package irvine.oeis.a079;

import java.util.HashMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Pair;

/**
 * A079074 Sum of numbers &lt; n having in binary representation the same number of 0's and 1's as n.
 * @author Sean A. Irvine
 */
public class A079074 extends Sequence0 {

  private final HashMap<Pair<Integer, Integer>, Long> mCounts = new HashMap<>();
  private long mN = -1;

  @Override
  public Z next() {
    final int ones = Long.bitCount(++mN);
    final int zeros = Functions.DIGIT_LENGTH.i(2, mN) - ones;
    final Pair<Integer, Integer> key = new Pair<>(ones, zeros);
    return Z.valueOf(mCounts.merge(key, mN, Long::sum) - mN);
  }
}

