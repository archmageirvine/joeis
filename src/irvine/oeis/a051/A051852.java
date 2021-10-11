package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051852 A051851(n)/row_index_of(n).
 * @author Sean A. Irvine
 */
public class A051852 extends A051851 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}

