package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a006.A006385;
import irvine.oeis.a006.A006443;

/**
 * A054937 Number of chiral pairs of planar maps with n edges.
 * @author Sean A. Irvine
 */
public class A054937 extends A006385 {

  private final Sequence mA = new A006443();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
