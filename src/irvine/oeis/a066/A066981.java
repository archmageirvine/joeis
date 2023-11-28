package irvine.oeis.a066;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A066981 Number of residues of Lucas numbers modulo n.
 * @author Sean A. Irvine
 */
public class A066981 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final HashSet<Long> residues = new HashSet<>();
    final HashSet<Pair<Long, Long>> seen = new HashSet<>();
    long a = 2 % mN;
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
