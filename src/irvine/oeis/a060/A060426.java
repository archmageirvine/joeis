package irvine.oeis.a060;

import java.util.HashMap;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;

/**
 * A060426 a(n) is the number of degrees in the sequence of the degrees of the irreducible representations of the symmetric group S_n that appear only once.
 * @author Sean A. Irvine
 */
public class A060426 extends A060240 {

  /** Construct the sequence. */
  public A060426() {
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
    long uniqueCount = 0;
    for (final Long v : counts.values()) {
      if (v == 1) {
        ++uniqueCount;
      }
    }
    return Z.valueOf(uniqueCount);
  }
}
