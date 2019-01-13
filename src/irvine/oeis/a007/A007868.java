package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000085;
import irvine.oeis.a000.A000142;

/**
 * A007868.
 * @author Sean A. Irvine
 */
public class A007868 extends A000142 {

  private Sequence mA = new A000085();

  @Override
  public Z next() {
    return super.next().add(mA.next()).divide2();
  }
}
