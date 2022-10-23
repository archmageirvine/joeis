package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.English;

/**
 * A005589 Number of letters in the US English name of n, excluding spaces and hyphens.
 * @author Sean A. Irvine
 */
public class A005589 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(English.SINGLETON.toRawText(++mN).length());
  }
}

