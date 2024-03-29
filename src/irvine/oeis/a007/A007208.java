package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.German;

/**
 * A007208 Number of letters in German name of n.
 * @author Sean A. Irvine
 */
public class A007208 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(German.SINGLETON.toText(++mN).length());
  }
}

