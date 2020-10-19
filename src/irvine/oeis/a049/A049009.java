package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a035.A035206;
import irvine.oeis.a036.A036038;

/**
 * A049009 Number of functions from a set to itself such that the sizes of the preimages of the individual elements in the range form the n-th partition in Abramowitz and Stegun order.
 * @author Sean A. Irvine
 */
public class A049009 extends A035206 {

  private final Sequence mA036038 = new A036038();

  @Override
  public Z next() {
    return super.next().multiply(mA036038.next());
  }
}

