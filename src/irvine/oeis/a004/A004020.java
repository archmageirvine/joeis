package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a008.A008441;

/**
 * A004020.
 * @author Sean A. Irvine
 */
public class A004020 extends A008441 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
