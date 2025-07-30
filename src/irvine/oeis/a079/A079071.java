package irvine.oeis.a079;

import java.util.HashMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Pair;

/**
 * A079071 Number of numbers &lt; n whose binary representation has the same number of 0's and 1's as n does.
 * @author Sean A. Irvine
 */
public class A079071 extends Sequence0 {

  private final HashMap<Pair<Integer, Integer>, Long> mCounts = new HashMap<>();
  private long mN = -1;

  @Override
  public Z next() {
    final int ones = Long.bitCount(++mN);
    final int zeros = Functions.DIGIT_LENGTH.i(2, mN) - ones;
    final Pair<Integer, Integer> key = new Pair<>(ones, zeros);
    return Z.valueOf(mCounts.merge(key, 1L, Long::sum) - 1);
  }
}

