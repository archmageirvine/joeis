package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001489.
 * @author Sean A. Irvine
 */
public class A001489 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    return Z.valueOf(--mN);
  }
}
