package irvine.oeis.a098;

import irvine.math.z.Z;
import irvine.oeis.a005.A005150;

/**
 * A098097 Terms of sequence A005150 interpreted as numbers written in base 4 (written here in base ten).
 * @author Sean A. Irvine
 */
public class A098097 extends A005150 {

  @Override
  public Z next() {
    return new Z(super.next().toString(), 4);
  }
}
