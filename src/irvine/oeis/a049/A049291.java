package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049291 Number of subgroups of index n in free group of rank 4.
 * @author Sean A. Irvine
 */
public class A049291 extends A049290 {

  private int mN = 0;

  @Override
  public Z next() {
    return get(4, ++mN);
  }
}
