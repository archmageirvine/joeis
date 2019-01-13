package irvine.oeis.a014;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A014486.
 * @author Sean A. Irvine
 */
public class A014486 implements Sequence {

  private final TreeMap<Z, Pair<Integer, Integer>> mState = new TreeMap<>();

  @Override
  public Z next() {
    if (mState.isEmpty()) {
      mState.put(Z.ONE, new Pair<>(0, 1));
      return Z.ZERO;
    }
    while (true) {
      final Map.Entry<Z, Pair<Integer, Integer>> e = mState.pollFirstEntry();
      final Pair<Integer, Integer> value = e.getValue();
      final int zeros = value.left();
      final int ones = value.right();
      final Z m = e.getKey().multiply2();
      mState.put(m.add(1), new Pair<>(zeros, ones + 1));
      if (zeros < ones) {
        mState.put(m, new Pair<>(zeros + 1, ones));
      }
      if (zeros == ones) {
        return e.getKey();
      }
    }
  }
}
