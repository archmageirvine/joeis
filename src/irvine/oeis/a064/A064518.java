package irvine.oeis.a064;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A064518 For an integer n with prime factorization p_1*p_2*p_3* ... *p_m let n* = (p_1+1)*(p_2+1)*(p_3+1)* ... *(p_m+1); sequence gives n* such that n* is divisible by n, ordered by increasing value of n.
 * @author Sean A. Irvine
 */
public class A064518 extends Sequence1 {

  private final TreeMap<Z, Pair<Long, Long>> mA = new TreeMap<>();
  {
    mA.put(Z.ONE, new Pair<>(0L, 0L));
  }

  @Override
  public Z next() {
    while (true) {
      final Map.Entry<Z, Pair<Long, Long>> e = mA.pollFirstEntry();
      final Z n = e.getKey();
      final Pair<Long, Long> exp = e.getValue();
      mA.put(n.shiftLeft(1), new Pair<>(exp.left() + 1, exp.right()));
      mA.put(n.multiply(3), new Pair<>(exp.left(), exp.right() + 1));
      if (exp.left() >= exp.right() && exp.left() <= 2 * exp.right()) {
        return Z.THREE.pow(exp.left()).shiftLeft(2 * exp.right());
      }
    }
  }
}

