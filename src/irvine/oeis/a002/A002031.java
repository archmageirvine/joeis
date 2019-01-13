package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002031.
 * @author Sean A. Irvine
 */
public class A002031 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    return A002032.f(++mN, 2);
  }
}

