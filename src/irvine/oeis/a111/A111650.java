package irvine.oeis.a111;
// manually 2021-10-01

import irvine.math.z.Z;
import irvine.oeis.BorderedTriangleRecurrence;
import irvine.oeis.a005.A005843;

/**
 * A111650 2n appears n times (n&gt;0). 
 * @author Georg Fischer
 */
public class A111650 extends BorderedTriangleRecurrence {

  /** Construct the sequence. */
  public A111650() {
    super(new A005843(), new A005843(), new A005843());
    skipLeft(1);
    skipRight(1);
    skipAdd(1);
  }
  
  @Override
  protected Z compute(final int n, final int k) {
    return get(k - 1).add(get(k)).subtract(getA());
  }
}
