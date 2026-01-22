package irvine.oeis.a392;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a051.A051038;

/**
 * A392256 a(n) is the conjectured largest number such that both a(n) and a(n) - n are 11-smooth numbers, or 0 if no such number exists. a(n) can be less than n.
 * @author Sean A. Irvine
 */
public class A392256 extends Sequence1 implements Conjectural {

  private static final long HEURISTIC = 1000; // maybe this should depend on n
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final TreeSet<Z> smooth = new TreeSet<>();
    final Sequence seq = new A051038();
    Z max = null;
    while (true) {
      final Z t = seq.next();
      if (smooth.contains(t.subtract(mN).abs())) {
        max = t;
      }
      while (!smooth.isEmpty() && smooth.first().subtract(t).compareTo(mN) > 0) {
        smooth.pollFirst();
      }
      smooth.add(t);
      if (max != null && max.multiply(HEURISTIC).compareTo(t) < 0) {
        return max;
      }
    }
  }
}
