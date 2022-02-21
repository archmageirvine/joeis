package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a053.A053990;

/**
 * A054734 Numbers of the form 2*x*(x + 1)*y*(y + 1) where x and y are distinct.
 * @author Sean A. Irvine
 */
public class A054734 extends A053990 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
