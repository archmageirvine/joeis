package irvine.oeis.a038;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038203 Number of distinct values of factorials mod n.
 * @author Sean A. Irvine
 */
public class A038203 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final TreeSet<Long> residues = new TreeSet<>();
    long f = 1;
    long k = 0;
    while (f != 0) {
      f *= ++k;
      f %= mN;
      residues.add(f);
    }
    return Z.valueOf(residues.size());
  }
}
