package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051751 Cubes arising in A051750.
 * @author Sean A. Irvine
 */
public class A051751 extends A051750 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}

