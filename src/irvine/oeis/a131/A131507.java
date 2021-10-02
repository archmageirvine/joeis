package irvine.oeis.a131;
// manually 2021-10-01

import irvine.math.z.Z;
import irvine.oeis.BorderedTriangleRecurrence;
import irvine.oeis.a005.A005408;

/**
 * A131507 2n+1 appears n+1 times. 
 * @author Georg Fischer
 */
public class A131507 extends BorderedTriangleRecurrence {

  /** Construct the sequence. */
  public A131507() {
    super(new A005408(), new A005408(), new A005408());
  }
  
  @Override
  protected Z compute(final int n, final int k) {
    return get(k - 1).add(get(k)).subtract(getA());
  }
}
