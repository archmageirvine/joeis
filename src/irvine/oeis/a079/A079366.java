package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079366 Cost\u00e9 prime expansion of Pi - 3.
 * @author Sean A. Irvine
 */
public class A079366 extends Sequence0 {

  // Cost&eacute; prime expansion

  private CR mX;

  protected A079366(final CR x) {
    mX = x;
  }

  /** Construct the sequence. */
  public A079366() {
    this(CR.PI.subtract(3));
  }

  private Z p(final CR x) {
    final Z y = x.inverse().ceil();
    return Functions.NEXT_PRIME.z(y.subtract(1));
  }

  @Override
  public Z next() {
    final Z p = p(mX);
    mX = mX.multiply(p).subtract(1);
    return p;
  }
}
