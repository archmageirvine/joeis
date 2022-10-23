package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.Spanish;

/**
 * A011762 Number of letters in n (in Spanish).
 * @author Sean A. Irvine
 */
public class A011762 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(Spanish.SINGLETON.toRawText(++mN).length());
  }
}
