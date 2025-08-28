package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079827 a(n) = floor((n + reverse(n))/2).
 * @author Sean A. Irvine
 */
public class A079827 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.REVERSE.z(++mN).add(mN).divide2();
  }
}

