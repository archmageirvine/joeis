package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a067.A067177;

/**
 * A061096 Let k = n-th number that is a possible digit-sum for a cube (A054966); sequence gives smallest cube with digit-sum k.
 * @author Sean A. Irvine
 */
public class A061096 extends A067177 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
