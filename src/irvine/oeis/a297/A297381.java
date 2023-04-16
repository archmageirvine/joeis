package irvine.oeis.a297;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a023.A023900;

/**
 * A297381 Numerator of -A023900(n)/2.
 * @author Georg Fischer
 */
public class A297381 extends A023900 {

  @Override
  public Z next() {
    return new Q(super.next().negate(), Z.TWO).num();
  }
}
