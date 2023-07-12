package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000088;
import irvine.oeis.a000.A000171;
import irvine.oeis.a001.A001349;

/**
 * A054931 Number of unlabeled connected graphs up to complementarity.
 * @author Sean A. Irvine
 */
public class A054931 extends A001349 {

  private final Sequence mA = new A000088();
  private final Sequence mB = new A000171();

  {
    setOffset(1);
    super.next();
    mA.next();
  }

  @Override
  public Z next() {
    return super.next().add(mB.next().subtract(mA.next()).divide2());
  }
}
