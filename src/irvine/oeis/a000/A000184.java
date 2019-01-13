package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a029.A029887;

/**
 * A000184.
 * @author Sean A. Irvine
 */
public class A000184 extends A029887 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}

