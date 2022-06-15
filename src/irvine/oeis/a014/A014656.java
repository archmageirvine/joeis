package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.Norwegian;

/**
 * A014656 Numbers of letters in n (in the Norwegian language Bokm\u00e5l).
 * @author Sean A. Irvine
 */
public class A014656 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Norwegian.SINGLETON.toRawText(++mN).length());
  }
}

