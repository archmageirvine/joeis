package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a125.A125790;

/**
 * A002577 Number of partitions of 2^n into powers of 2.
 * @author Sean A. Irvine
 */
public class A002577 extends A125790 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, 1L);
  }
}
