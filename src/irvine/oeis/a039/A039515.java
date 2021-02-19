package irvine.oeis.a039;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A039515 Conjecturally, largest attractor in '3x+(2n+1)' problem.
 * @author Sean A. Irvine
 */
public class A039515 extends A039508 {

  // Heuristic
  private static final long MAX = 100000;

  @Override
  public Z next() {
    mN += 2;
    final TreeSet<Z> min = new TreeSet<>();
    for (long k = 1; k <= MAX; ++k) {
      min.add(run(Z.valueOf(k), mN));
    }
    return min.last();
  }
}
