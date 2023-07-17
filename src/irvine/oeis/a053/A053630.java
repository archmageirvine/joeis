package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a000.A000058;

/**
 * A053630 Pythagorean spiral: a(n-1), a(n)-1 and a(n) are sides of a right triangle.
 * @author Sean A. Irvine
 */
public class A053630 extends A000058 {

  /** Construct the sequence. */
  public A053630() {
    super(1);
  }

  @Override
  public Z next() {
    return super.next().multiply2().subtract(1);
  }
}
