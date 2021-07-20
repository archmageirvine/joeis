package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002485 Numerators of convergents to Pi.
 * @author Sean A. Irvine
 */
public class A002485 implements Sequence {

  private final Convergents mC = new Convergents(CR.PI);
  private long mN = -1;

  @Override
  public Z next() {
    if (mN < 1) {
      return Z.valueOf(++mN);
    }
    return mC.next().num();
  }
}
