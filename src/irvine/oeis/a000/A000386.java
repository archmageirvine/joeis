package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a058.A058057;

/**
 * A000386.
 * @author Sean A. Irvine
 */
public class A000386 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return A058057.t(mN, mN - 3);
  }
}
