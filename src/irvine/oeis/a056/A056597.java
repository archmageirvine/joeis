package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.Croatian;

/**
 * A056597 Number of letters in n in Serbian or Croatian.
 * @author Sean A. Irvine
 */
public class A056597 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Croatian.SINGLETON.toText(++mN).replace(" ", "").length());
  }
}

