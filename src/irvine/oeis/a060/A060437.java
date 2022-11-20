package irvine.oeis.a060;

import java.util.HashSet;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;

/**
 * A060437 a(n) is the number of different degrees in the sequence of the degrees of the irreducible representations of the symmetric group S_n, i.e., count each degree only once.
 * @author Sean A. Irvine
 */
public class A060437 extends A060240 {

  private int mN = 0;

  @Override
  public Z next() {
    final IntegerPartition partitions = new IntegerPartition(++mN);
    final HashSet<Z> seen = new HashSet<>();
    int[] p;
    while ((p = partitions.next()) != null) {
      final Z deg = degree(mN, p);
      seen.add(deg);
    }
    return Z.valueOf(seen.size());
  }
}
