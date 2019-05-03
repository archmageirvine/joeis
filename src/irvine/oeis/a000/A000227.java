package irvine.oeis.a000;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A000227 Nearest integer to <code>e^n</code>.
 * @author Sean A. Irvine
 */
public class A000227 extends A000149 {

  @Override
  public Z next() {
    return nextRational().add(Q.HALF).toZ();
  }
}
