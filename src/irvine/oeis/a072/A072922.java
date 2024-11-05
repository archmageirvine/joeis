package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.English;

/**
 * A072922 Spell English name for n, then interpret as number in base 36.
 * @author Sean A. Irvine
 */
public class A072922 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return new Z(English.SINGLETON.toRawText(++mN), 36);
  }
}

