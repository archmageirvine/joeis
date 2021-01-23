package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000151;

/**
 * A038055 Number of n-node rooted trees with nodes of 2 colors.
 * @author Sean A. Irvine
 */
public class A038055 extends A000151 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
