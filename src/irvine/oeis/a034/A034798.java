package irvine.oeis.a034;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a006.A006016;

/**
 * A034798 Value of n considered as a game.
 * @author Sean A. Irvine
 */
public class A034798 extends MemorySequence {

  private long mN = -1;

  @Override
  protected Z computeNext() {
    final TreeSet<Long> t = new TreeSet<>();
    long u = ++mN;
    int k = 0;
    while (u != 0) {
      if ((u & 1) == 1) {
        t.add(get(k).longValueExact());
      }
      u >>>= 1;
      ++k;
    }
    return Z.valueOf(A006016.mex(t));
  }
}
