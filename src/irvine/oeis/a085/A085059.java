package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a008.A008344;

/**
 * A085059.
 * @author Sean A. Irvine
 */
public class A085059 extends A008344 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}


