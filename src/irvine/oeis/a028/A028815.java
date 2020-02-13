package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a008.A008578;

/**
 * A028815.
 * @author Sean A. Irvine
 */
public class A028815 extends A008578 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
