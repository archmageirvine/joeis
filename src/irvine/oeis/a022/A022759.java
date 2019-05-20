package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002476;
import irvine.oeis.a007.A007528;

/**
 * A022759.
 * @author Sean A. Irvine
 */
public class A022759 implements Sequence {

  private Sequence mA = new A002476();
  private Sequence mB = new A007528();

  @Override
  public Z next() {
    return mA.next().add(mB.next());
  }
}
