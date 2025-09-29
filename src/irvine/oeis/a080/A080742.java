package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A080742 Largest element of n-th row of A080738.
 * @author Sean A. Irvine
 */
public class A080742 extends A080738 {

  @Override
  public Z next() {
    step();
    return Functions.MAX.z(mList);
  }
}
