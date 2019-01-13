package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010034.
 * @author Sean A. Irvine
 */
public class A010034 implements Sequence {

  private static final Z A = new Z("8424432925592889329288197322308900672459420460792433");
  private static final Z B = new Z("8936582237915716659950962253358945635793453256935559");
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? A : mA.add(B);
    return mA;
  }
}
