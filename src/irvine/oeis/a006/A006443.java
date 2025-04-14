package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006443 Number of achiral planar maps on n nodes up to orientation-preserving isomorphisms.
 * @author Sean A. Irvine
 */
public class A006443 extends A006385 {

  private final Sequence mA = new A006384();

  @Override
  public Z next() {
    return super.next().multiply2().subtract(mA.next());
  }
}
