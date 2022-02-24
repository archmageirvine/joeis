package irvine.oeis.a155;
// manually insect/insect2 at 2022-02-24 18:18

import irvine.math.z.Z;
import irvine.oeis.IntersectionSequence;
import irvine.oeis.a049.A049422;
import irvine.oeis.a111.A111051;

/**
 * A155962 Numbers n with property that 3*(2n)^2+1 and 1*(2n)^2+3 are primes.
 * @author Georg Fischer
 */
public class A155962 extends IntersectionSequence {

  /** Construct the sequence. */
  public A155962() {
    super(new A049422(), new A111051());
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
