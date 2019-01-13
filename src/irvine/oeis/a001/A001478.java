package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001478.
 * @author Sean A. Irvine
 */
public class A001478 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(--mN);
  }
}
