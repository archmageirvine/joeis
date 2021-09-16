package irvine.oeis.a051;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051478 Number of values of n satisfying phi(n)=4i+2, i&gt;0.
 * @author Sean A. Irvine
 */
public class A051478 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    mN += 4;
    return Z.valueOf(Euler.inversePhi(Z.valueOf(mN)).size());
  }
}
