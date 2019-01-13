package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005771.
 * @author Sean A. Irvine
 */
public class A005771 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return A005747.covers(5, ++mN);
  }
}
