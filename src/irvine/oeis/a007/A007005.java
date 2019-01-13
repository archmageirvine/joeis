package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.French;

/**
 * A007005.
 * @author Sean A. Irvine
 */
public class A007005 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(French.toFrench(++mN).length());
  }
}

