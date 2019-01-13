package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000030.
 * @author Sean A. Irvine
 */
public class A000030 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(String.valueOf(++mN).charAt(0) - '0');
  }
}

