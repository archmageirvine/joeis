package irvine.oeis.a090;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.Dutch;

/**
 * A090589 Number of letters in n (in Dutch) counting 'ij' as two letters.
 * @author Sean A. Irvine
 */
public class A090589 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(Dutch.SINGLETON.toRawText(++mN).length());
  }
}
