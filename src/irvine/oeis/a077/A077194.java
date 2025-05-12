package irvine.oeis.a077;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * A077194 Smallest multiple of n with least digit sum.
 * @author Sean A. Irvine
 */
public class A077194 extends A077196 {

  // After Jason Yuen

  protected int mN = 0;
  private static final class State extends Pair<Integer, Z> implements Comparable<State> {
    private State(final int left, final Z right) {
      super(left, right);
    }

    @Override
    public int compareTo(final State other) {
      return left().compareTo(other.left());
    }
  }

  @Override
  public Z next() {
    ++mN;
    final Map<Integer, State> dist = new HashMap<>();
    for (int k = 0; k < mN; ++k) {
      dist.put(k, new State(mN + 1, Z.ZERO));
    }
    return dijkstra(dist, 1 % mN, new State(1, Z.ONE),
      (remainder, d) -> List.of(new Pair<>(new State(d.left(), d.right().multiply(10)), (remainder * 10) % mN), new Pair<>(new State(d.left() + 1, d.right().add(1)), (remainder + 1) % mN)))
      .get(0).right();
  }
}

