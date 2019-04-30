package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A005589 Number of letters in the US English name of n, excluding spaces and hyphens.
 * @author Sean A. Irvine
 */
public class A005589 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(English.toRawEnglish(++mN).length());
  }
}

