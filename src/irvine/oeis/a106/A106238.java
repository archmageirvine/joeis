package irvine.oeis.a106;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a035.A035512;
import irvine.oeis.triangle.Triangle;

/**
 * A106238 Triangle read by rows: T(n,m) is the number of semi-strong digraphs on n unlabeled nodes with m connected components.
 * @author Gregory Morse
 */
public class A106238 extends Triangle {
  private final DirectSequence mStrong = DirectSequence.create(new A035512());

  /** Construct the sequence. */
  public A106238() {
    setOffset(1);
  }

  @Override
  protected Z compute(final int n, final int k) {
    final IntegerPartition partitions = new IntegerPartition(n + 1);
    Z sum = Z.ZERO;
    int[] p;
    while ((p = partitions.next()) != null) {
      if (p.length == k + 1) {
        Z ways = Z.ONE;
        for (int j = 0; j < p.length;) {
          int end = j + 1;
          while (end < p.length && p[end] == p[j]) {
            ++end;
          }
          ways = ways.multiply(Binomial.binomial(mStrong.a(p[j]).add(end - j - 1L), end - j));
          j = end;
        }
        sum = sum.add(ways);
      }
    }
    return sum;
  }
}
