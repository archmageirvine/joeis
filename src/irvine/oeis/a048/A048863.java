package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005867;

/**
 * A048863 Number of nonprimes (1 and composites) in the reduced residue system of n-th primorial number (A002110).
 * @author Sean A. Irvine
 */
public class A048863 extends A005867 {

  private final Sequence mA = new A048862();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
