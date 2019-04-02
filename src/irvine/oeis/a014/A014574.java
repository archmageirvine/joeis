package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A014574 Average of twin prime pairs.
 * @author Sean A. Irvine
 */
public class A014574 extends A001359 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
