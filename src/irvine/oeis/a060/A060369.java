package irvine.oeis.a060;

import java.util.HashMap;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;

/**
 * A060369 a(n) is the maximum number of occurrences of a degree in the sequence of the degrees of the irreducible representations of the symmetric group S_n.
 * @author Sean A. Irvine
 */
public class A060369 extends A060240 {

  /** Construct the sequence. */
  public A060369() {
    super(1);
  }

  private int mN = 0;

  @Override
  public Z next() {
    final IntegerPartition partitions = new IntegerPartition(++mN);
    final HashMap<Z, Long> counts = new HashMap<>();
    int[] p;
    while ((p = partitions.next()) != null) {
      final Z deg = degree(mN, p);
      counts.merge(deg, 1L, Long::sum);
    }
    long max = 0;
    for (final Long v : counts.values()) {
      if (v > max) {
        max = v;
      }
    }
    return Z.valueOf(max);
  }
}
