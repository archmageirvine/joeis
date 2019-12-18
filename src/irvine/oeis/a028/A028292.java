package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.Nynorsk;

/**
 * A028292 Numbers of letters in <code>n</code> (in the Norwegian language Nynorsk).
 * @author Sean A. Irvine
 */
public class A028292 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Nynorsk.SINGLETON.toRawText(++mN).length());
  }
}

