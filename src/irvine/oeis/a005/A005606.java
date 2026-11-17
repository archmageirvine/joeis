package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.util.string.English;

/**
 * A005606 Position of first letter of n (in English) in alphabet.
 * @author Sean A. Irvine
 */
public class A005606 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final long n) {
    return Z.valueOf(English.SINGLETON.toText(Math.toIntExact(n)).charAt(0) - '`');
  }

}

