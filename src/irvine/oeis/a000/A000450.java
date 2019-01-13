package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a058.A058057;

/**
 * A000450.
 * @author Sean A. Irvine
 */
public class A000450 implements Sequence {

  private int mN = 3;

  @Override
  public Z next() {
    ++mN;
    return A058057.t(mN, mN - 4);
  }
}
