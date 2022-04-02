package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a035.A035143;

/**
 * A055666 Number of inequivalent Eisenstein-Jacobi primes of successive norms (indexed by A055664).
 * @author Sean A. Irvine
 */
public class A055666 extends A035143 {

  private final Sequence mNorms = new A055664();

  /** Construct the sequence. */
  public A055666() {
    super(-3);
  }

  @Override
  public Z next() {
    final long m = mNorms.next().longValueExact();
    while (mN < m - 1) {
      super.next();
    }
    return super.next();
  }
}
