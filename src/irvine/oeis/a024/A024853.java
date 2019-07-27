package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024853.
 * @author Sean A. Irvine
 */
public class A024853 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    final long m = ++mN / 2;
    return Z.valueOf(m).multiply(m + 1).multiply(3 * mN + 5 - 2 * m).divide(6);
  }
}
