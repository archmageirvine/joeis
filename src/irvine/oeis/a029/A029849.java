package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000595;
import irvine.oeis.a002.A002500;

/**
 * A029849 Number of nonisomorphic and nonantiisomorphic relations.
 * @author Sean A. Irvine
 */
public class A029849 extends A002500 {

  private final Sequence mA = new A000595();

  @Override
  public Z next() {
    return super.next().add(mA.next()).divide2();
  }
}
