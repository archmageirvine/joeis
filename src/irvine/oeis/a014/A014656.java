package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.Norwegian;

/**
 * A014656.
 * @author Sean A. Irvine
 */
public class A014656 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Norwegian.toNorwegian(++mN).replace(" ", "").length());
  }
}

