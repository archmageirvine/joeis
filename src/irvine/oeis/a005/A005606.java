package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.English;

/**
 * A005606 Position of first letter of n (in English) in alphabet.
 * @author Sean A. Irvine
 */
public class A005606 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(English.SINGLETON.toText(++mN).charAt(0) - '`');
  }
}

