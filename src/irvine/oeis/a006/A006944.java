package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A006944 Number of letters in the n-th ordinal number (in American English).
 * @author Georg Fischer
 */
public class A006944 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(English.SINGLETON.toOrdinalText(++mN).replace(" and ", "").replaceAll("[- ,]", "").length());
  }
}

