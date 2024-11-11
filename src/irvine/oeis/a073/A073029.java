package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.English;

/**
 * A073029 Names for numbers in American English, with each letter transformed into its index in the alphabet.
 * @author Sean A. Irvine
 */
public class A073029 extends Sequence0 {

  private String mW = "zero";
  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM >= mW.length()) {
      mW = English.SINGLETON.toRawText(++mN);
      mM = 0;
    }
    return Z.valueOf(mW.charAt(mM) - '`');
  }
}
