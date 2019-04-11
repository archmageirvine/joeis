package irvine.oeis.a007;

import java.util.Collections;

import irvine.math.z.Z;
import irvine.oeis.a051.A051424;

/**
 * A007359 Number of partitions of n into pairwise coprime parts that are <code>&gt;= 2</code>.
 * @author Sean A. Irvine
 */
public class A007359 extends A051424 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return b(mN, mN, Collections.emptySet())
      .subtract(b(mN - 1, mN - 1, Collections.emptySet()));
  }
}
