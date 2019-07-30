package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a219.A219180;

/**
 * A024936.
 * @author Sean A. Irvine
 */
public class A024936 extends A219180 {

  @Override
  public Z next() {
    return Z.valueOf(super.nextRow().length - 1);
  }
}
