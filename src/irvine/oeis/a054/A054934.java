package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001174;
import irvine.oeis.a005.A005639;

/**
 * A054934 Number of oriented graphs on n nodes up to reversing the arcs.
 * @author Sean A. Irvine
 */
public class A054934 extends A001174 {

  private final Sequence mA = new A005639();

  @Override
  public Z next() {
    return super.next().add(mA.next()).divide2();
  }
}
