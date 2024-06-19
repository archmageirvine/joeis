package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A000009 Expansion of Product_{m &gt;= 1} (1 + x^m); number of partitions of n into distinct parts; number of partitions of n into odd parts.
 * @author Sean A. Irvine
 */
public class A000009 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  @Override
  public Z a(final Z n) {
    return Functions.DISTINCT_PARTITIONS.z(n);
  }

  @Override
  public Z a(final int n) {
    return Functions.DISTINCT_PARTITIONS.z(n);
  }

  @Override
  public Z next() {
    return Functions.DISTINCT_PARTITIONS.z(++mN);
  }
}

