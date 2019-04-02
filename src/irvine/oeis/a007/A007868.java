package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000085;
import irvine.oeis.a000.A000142;

/**
 * A007868 Number of inverse pairs of elements in symmetric group S_n, or pairs of total orders on n nodes (average of A000085 and A000142).
 * @author Sean A. Irvine
 */
public class A007868 extends A000142 {

  private Sequence mA = new A000085();

  @Override
  public Z next() {
    return super.next().add(mA.next()).divide2();
  }
}
