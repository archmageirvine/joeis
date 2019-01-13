package irvine.oeis.a000;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A000227.
 * @author Sean A. Irvine
 */
public class A000227 extends A000149 {

  @Override
  public Z next() {
    return nextRational().add(Q.HALF).toZ();
  }
}
