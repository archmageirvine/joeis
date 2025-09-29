package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A080741 Smallest element of n-th row of A080738.
 * @author Sean A. Irvine
 */
public class A080741 extends A080738 {

  @Override
  public Z next() {
    step();
    return Functions.MIN.z(mList);
  }
}
