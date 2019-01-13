package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005786.
 * @author Sean A. Irvine
 */
public class A005786 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return A005747.covers(++mN, 6);
  }
}
