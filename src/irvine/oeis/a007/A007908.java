package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007908 Triangle of the gods: to get a(n), concatenate the decimal numbers 1,2,3,...,n.
 * @author Sean A. Irvine
 */
public class A007908 extends Sequence1 {

  protected long mN = 0;
  private final StringBuilder mS = new StringBuilder();

  @Override
  public Z next() {
    mS.append(++mN);
    return new Z(mS);
  }
}
