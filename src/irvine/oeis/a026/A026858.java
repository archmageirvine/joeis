package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.Italian;

/**
 * A026858 Number of letters in n (in Italian).
 * @author Sean A. Irvine
 */
public class A026858 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(Italian.SINGLETON.toRawText(++mN).length());
  }
}
