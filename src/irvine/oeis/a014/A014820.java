package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014820.
 * @author Sean A. Irvine
 */
public class A014820 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n2 = Z.valueOf(++mN).square();
    return n2.multiply(n2.add(2)).divide(3);
  }
}
