package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a056.A056594;

/**
 * A006499 Number of restricted circular combinations.
 * @author Sean A. Irvine
 */
public class A006499 extends A000032 {

  private Sequence mA = new A056594();
  {
    super.next();
    super.next();
  }
  private Z mP = Z.ZERO;

  @Override
  public Z next() {
    final Z p = mP;
    mP = mA.next();
    return super.next().subtract(mP.multiply2()).subtract(p);
  }
}

