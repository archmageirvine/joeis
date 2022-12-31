package irvine.oeis.a162;

import irvine.math.z.Z;
import irvine.oeis.a001.A001694;

/**
 * A162965 Concatenation of the first n powerful numbers A001694.
 * @author Georg Fischer
 */
public class A162965 extends A001694 {

  private final StringBuilder mSb = new StringBuilder();

  @Override
  public Z next() {
    mSb.append(super.next().toString());
    return new Z(mSb.toString());
  }
}
