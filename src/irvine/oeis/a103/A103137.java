package irvine.oeis.a103;

import irvine.math.z.Z;
import irvine.oeis.a155.A155069;

/**
 * A103137 First column of inverse of Delannoy triangle.
 * @author Georg Fischer
 */
public class A103137 extends A155069 {

  private int mM = -1;

  @Override
  public Z next() {
    return (++mM & 1) == 0 ? super.next() : super.next().negate();
  }
}
