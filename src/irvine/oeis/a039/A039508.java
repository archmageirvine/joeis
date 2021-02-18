package irvine.oeis.a039;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039508 Conjecturally, number of minimum points of '3x+(2n+1)' problem.
 * @author Sean A. Irvine
 */
public class A039508 implements Sequence {

  // Heuristic
  private static final long MAX = 100000;

  protected long mN = -1;

  protected Z run(Z n, final long add) {
    final TreeSet<Z> seen = new TreeSet<>();
    while (seen.add(n)) {
      n = n.isEven() ? n.divide2() : n.multiply(3).add(add);
    }
    // Found a cycle, not redo and find the minimum value of the cycle
    seen.clear();
    while (seen.add(n)) {
      n = n.isEven() ? n.divide2() : n.multiply(3).add(add);
    }
    return seen.first();
  }

  @Override
  public Z next() {
    mN += 2;
    final TreeSet<Z> min = new TreeSet<>();
    for (long k = 1; k <= MAX; ++k) {
      min.add(run(Z.valueOf(k), mN));
    }
    //System.out.println(min);
    return Z.valueOf(min.size());
  }
}
