package irvine.oeis.a392;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A392924 The number of partitions of n such that there exists a part p, that appears in exactly p*K/100 parts, where K is the total number of parts.
 * @author Sean A. Irvine
 */
public class A392924 extends AbstractSequence {

  private int mN = 18;

  /** Construct the sequence. */
  public A392924() {
    super(19);
  }

  @Override
  public Z next() {
    final IntegerPartition part = new IntegerPartition(++mN);
    long cnt = 0;
    final int[] c = new int[mN + 1];
    int[] p;
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, c);
      for (int k = 1; k < c.length; ++k) {
        if (c[k] * 100 == k * p.length) {
          ++cnt;
          break;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
