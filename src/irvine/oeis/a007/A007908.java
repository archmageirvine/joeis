package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007908 Triangle of the gods: to get <code>a(n)</code>, concatenate the decimal numbers <code>1,2,3,...,n</code>.
 * @author Sean A. Irvine
 */
public class A007908 implements Sequence {

  private long mN = 0;
  private final StringBuilder mS = new StringBuilder();

  @Override
  public Z next() {
    mS.append(++mN);
    return new Z(mS);
  }
}
