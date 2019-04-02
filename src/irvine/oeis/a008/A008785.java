package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008785 a(n) = (n+4)^n.
 * @author Sean A. Irvine
 */
public class A008785 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN + 4).pow(mN);
  }
}


