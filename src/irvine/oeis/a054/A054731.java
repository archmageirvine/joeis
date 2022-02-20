package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a053.A053990;

/**
 * A054731 Numbers of the form x*(x + 1)*y*(y + 1)/4 where x and y are distinct.
 * @author Sean A. Irvine
 */
public class A054731 extends A053990 {

  @Override
  public Z next() {
    return super.next().divide(4);
  }
}
