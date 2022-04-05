package irvine.oeis.a090;

import irvine.math.z.Z;
import irvine.oeis.a007.A007530;

/**
 * A090258 Last term of prime quadruples.
 * @author Sean A. Irvine
 */
public class A090258 extends A007530 {

  @Override
  public Z next() {
    return super.next().add(8);
  }
}
