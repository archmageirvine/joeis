package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001073 Label a 1 cm ruler with digits 1 cm wide.
 * @author Sean A. Irvine
 */
public class A001073 implements Sequence {

  private long mN = -1;
  private String mW = "";

  @Override
  public Z next() {
    ++mN;
    if (mW.isEmpty()) {
      mW = String.valueOf(mN);
    }
    final char c = mW.charAt(0);
    mW = mW.substring(1);
    return Z.valueOf(c - '0');
  }
}

