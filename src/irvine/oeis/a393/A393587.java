package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.ThreeParameterFormSequence;
import irvine.oeis.a007.A007097;

/**
 * A393587 Matula-Goebel numbers of two-leaf rooted trees.
 * @author Sean A. Irvine
 */
public class A393587 extends ThreeParameterFormSequence {

  private static final DirectSequence A007097 = DirectSequence.create(new A007097());

  private static Z compute(final long k, final long b, final long c) {
    return k == 0 ? A007097.a(b).multiply(A007097.a(c)) : Functions.PRIME.z(compute(k - 1, b, c));
  }

  /** Construct the sequence. */
  public A393587() {
    super(1, 0, 1, 1, A393587::compute);
  }
}

