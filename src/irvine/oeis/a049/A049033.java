package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a001.A001820;

/**
 * A049033 Central factorial numbers.
 * @author Sean A. Irvine
 */
public class A049033 extends A001820 {

  @Override
  public Z next() {
    return super.next().shiftLeft((int) (2 * mN));
  }
}
