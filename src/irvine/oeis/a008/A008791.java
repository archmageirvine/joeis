package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008791 a(n) = n^(n+5).
 * @author Sean A. Irvine
 */
public class A008791 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN + 5);
  }
}


