package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000041;
import irvine.oeis.a000.A000700;

/**
 * A027187 Number of partitions of n into an even number of parts.
 * @author Sean A. Irvine
 */
public class A027187 extends A000041 {

  private final Sequence mA = new A000700();
  private boolean mSign = false;

  @Override
  public Z next() {
    mSign = !mSign;
    return super.next().signedAdd(mSign, mA.next()).divide2();
  }
}
