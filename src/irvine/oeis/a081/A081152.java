package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A081152 Number of even cycles in range [A014137(2n)..A014138(2n)] of permutation A057505/A057506.
 * @author Sean A. Irvine
 */
public class A081152 extends Sequence0 {

  private final Sequence mS = new A081150();

  @Override
  public Z next() {
    mS.next();
    return mS.next();
  }
}
