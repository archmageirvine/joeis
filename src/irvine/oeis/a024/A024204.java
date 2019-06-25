package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024204.
 * @author Sean A. Irvine
 */
public class A024204 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.add(2).multiply(mN).multiply(mN).divide(n.multiply(3).add(2));
  }
}

