package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a049.A049290;

/**
 * A057014 Number of subgroups of index n in free group of rank n.
 * @author Sean A. Irvine
 */
public class A057014 extends A049290 {

  private int mN = 0;

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
