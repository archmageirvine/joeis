package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.Russian;

/**
 * A006994 Number of letters in n (in Russian).
 * @author Sean A. Irvine
 */
public class A006994 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Russian.SINGLETON.toRawText(++mN).length());
  }
}
