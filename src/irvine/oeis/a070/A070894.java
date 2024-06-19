package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a103.A103314;

/**
 * A070894 Number of nonempty subsets of the set of vertices of a regular n-gon in the plane such that their center of gravity is the center of the polygon.
 * @author Sean A. Irvine
 */
public class A070894 extends Sequence2 {

  private final Sequence mA = new A103314().skip(2);

  @Override
  public Z next() {
    return mA.next().subtract(1);
  }
}
