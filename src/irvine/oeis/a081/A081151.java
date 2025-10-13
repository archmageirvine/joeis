package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A081151 Number of even cycles in range [A014137(2n-1)..A014138(2n-1)] of permutation A057505/A057506.
 * @author Sean A. Irvine
 */
public class A081151 extends Sequence0 {

  private final Sequence mS = new A081150().prepend(0);

  @Override
  public Z next() {
    mS.next();
    return mS.next();
  }
}
