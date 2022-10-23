package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A029846 a(n) = a(n-1)*b(n-2)+2, b() given by A029758.
 * @author Sean A. Irvine
 */
public class A029846 extends Sequence0 {

  private final Sequence mB = new PrependSequence(new A029758(), 1);
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(mB.next()).add(2);
    return mA;
  }
}
