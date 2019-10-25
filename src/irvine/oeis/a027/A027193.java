package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000041;
import irvine.oeis.a000.A000700;

/**
 * A027193 Number of partitions of n into an odd number of parts.
 * @author Sean A. Irvine
 */
public class A027193 extends A000041 {

  private final Sequence mA = new A000700();
  private boolean mSign = true;

  @Override
  public Z next() {
    mSign = !mSign;
    return super.next().signedAdd(mSign, mA.next()).divide2();
  }
}
