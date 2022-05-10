package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.Croatian;

/**
 * A056597 Number of letters in n in Serbian or Croatian.
 * @author Sean A. Irvine
 */
public class A056597 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Croatian.SINGLETON.toText(++mN).replace(" ", "").length());
  }
}

