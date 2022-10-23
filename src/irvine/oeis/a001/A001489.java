package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001489 a(n) = -n.
 * @author Sean A. Irvine
 */
public class A001489 extends Sequence0 {

  private long mN = 1;

  @Override
  public Z next() {
    return Z.valueOf(--mN);
  }
}
