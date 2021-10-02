package irvine.oeis.a265;
// manually 2021-10-01

import irvine.math.z.Z;
import irvine.oeis.BorderedTriangleRecurrence;
import irvine.oeis.a002.A002522;

/**
 * A265129 Triangle read by rows, formed as the sum of the two versions of the natural numbers filling an equilateral triangle. 
 * @author Georg Fischer
 */
public class A265129 extends BorderedTriangleRecurrence {

  /** Construct the sequence. */
  public A265129() {
    super(new A002522(), new A002522());
    skipLeft(1);
    skipRight(1);
  }
  
  @Override
  protected Z compute(final int n, final int k) {
    return Z.valueOf(n + 1).square().add(1);
  }
}
