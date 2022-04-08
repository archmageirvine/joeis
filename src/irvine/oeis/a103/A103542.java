package irvine.oeis.a103;

import irvine.math.z.Z;
import irvine.oeis.a102.A102370;

/**
 * A103542 Binary equivalents of A102370.
 * @author Georg Fischer
 */
public class A103542 extends A102370 {

  @Override
  public Z next() {
    return new Z(super.next().toString(2));
  }
}
