package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;
import irvine.oeis.a007.A007908;

/**
 * A067102.
 * @author Sean A. Irvine
 */
public class A067104 extends Sequence1 {

  private final Sequence mF = new A000142().skip();
  private final A007908 mA = new A007908();
  private final StringBuilder mX = new StringBuilder();

  @Override
  public Z next() {
    mX.append(mF.next());
    return new Z(mX).divide(mA.next());
  }
}
