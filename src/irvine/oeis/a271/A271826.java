package irvine.oeis.a271;
// manually insect/insect2 at 2022-02-24 18:52

import irvine.math.z.Z;
import irvine.oeis.IntersectionSequence;
import irvine.oeis.a000.A000290;
import irvine.oeis.a003.A003072;

/**
 * A271826 Integers n such that n^2 = x^3 + y^3 + z^3, where x, y, z are positive integers, is soluble.
 * @author Georg Fischer
 */
public class A271826 extends IntersectionSequence {

  /** Construct the sequence. */
  public A271826() {
    super(new A000290(), new A003072());
  }

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
