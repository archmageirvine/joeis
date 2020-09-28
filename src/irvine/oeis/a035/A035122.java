package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.a033.A033294;

/**
 * A035122 Roots of 'squares remaining square when written backwards'.
 * @author Sean A. Irvine
 */
public class A035122 extends A033294 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
