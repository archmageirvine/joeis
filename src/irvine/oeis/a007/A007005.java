package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.French;

/**
 * A007005 Number of characters in the French spelling of n, including spaces and hyphens.
 * @author Sean A. Irvine
 */
public class A007005 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(French.SINGLETON.toText(++mN).length());
  }
}

