package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a053.A053990;

/**
 * A054730.
 * @author Sean A. Irvine
 */
public class A054731 extends A053990 {

  @Override
  public Z next() {
    return super.next().divide(4);
  }
}
