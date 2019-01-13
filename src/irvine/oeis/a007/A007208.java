package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.German;

/**
 * A007208.
 * @author Sean A. Irvine
 */
public class A007208 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(German.toGerman(++mN).length());
  }
}

