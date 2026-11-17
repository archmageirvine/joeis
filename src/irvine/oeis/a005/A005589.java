package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.util.string.English;

/**
 * A005589 Number of letters in the US English name of n, excluding spaces and hyphens.
 * @author Sean A. Irvine
 */
public class A005589 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(English.SINGLETON.toRawText(++mN).length());
  }

  @Override
  public Z a(final Z n) {
    return Z.valueOf(English.SINGLETON.toRawText(n.intValueExact()).length());
  }

  @Override
  public Z a(final long n) {
    return Z.valueOf(English.SINGLETON.toRawText(Math.toIntExact(n)).length());
  }

}

