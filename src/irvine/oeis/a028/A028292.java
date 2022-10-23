package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.Nynorsk;

/**
 * A028292 Numbers of letters in n (in the Norwegian language Nynorsk).
 * @author Sean A. Irvine
 */
public class A028292 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Nynorsk.SINGLETON.toRawText(++mN).length());
  }
}

