package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.Swedish;

/**
 * A059124 Number of letters in n (in Swedish).
 * @author Sean A. Irvine
 */
public class A059124 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(Swedish.SINGLETON.toText(++mN).replace(" ", "").length());
  }
}

