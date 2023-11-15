package irvine.oeis.a066;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A066853 Number of different remainders (or residues) for the Fibonacci numbers (A000045) when divided by n (i.e., the size of the set of F(i) mod n over all i).
 * @author Sean A. Irvine
 */
public class A066853 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final HashSet<Long> residues = new HashSet<>();
    final HashSet<Pair<Long, Long>> seen = new HashSet<>();
    residues.add(0L);
    long a = 0;
    long b = 1 % mN;
    while (seen.add(new Pair<>(a, b))) {
      residues.add(b);
      final long t = (a + b) % mN;
      a = b;
      b = t;
    }
    return Z.valueOf(residues.size());
  }
}
