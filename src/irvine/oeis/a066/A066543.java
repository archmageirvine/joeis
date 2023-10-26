package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a212.A212796;

/**
 * A100960.
 * @author Sean A. Irvine
 */
public class A066543 extends A212796 {

  private long mN = 2;
  {
    setOffset(3);
  }

  @Override
  public Z next() {
    return numberOfSpanningTrees(++mN, mN).shiftLeft(3 * mN * mN - 1);
  }
}
