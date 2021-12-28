package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A053572.
 * @author Sean A. Irvine
 */
public class A053575 extends A000010 {

  @Override
  public Z next() {
    return super.next().makeOdd();
  }
}
