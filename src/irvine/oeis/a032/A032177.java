package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004111;

/**
 * A032177 Number of connected functions of n points with no fixed points and with no symmetries.
 * @author Sean A. Irvine
 */
public class A032177 extends A004111 {

  private final Sequence mA = new A032175();
  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    return mA.next().subtract(super.next());
  }
}
