package irvine.oeis.a098;

import irvine.math.z.Z;
import irvine.oeis.a005.A005150;

/**
 * A071291.
 * @author Sean A. Irvine
 */
public class A098097 extends A005150 {

  @Override
  public Z next() {
    return new Z(super.next().toString(), 4);
  }
}
