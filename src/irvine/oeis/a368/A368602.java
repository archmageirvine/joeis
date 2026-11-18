package irvine.oeis.a368;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a361.A361718;

/**
 * A368602 Triangle read by rows where T(n,k) is the number of labeled acyclic digraphs on {1..n} with sinks {1..k}.
 * @author Gregory Morse
 */
public class A368602 extends A361718 {
  @Override
  protected Z compute(final int n, final int k) {
    return super.compute(n, k).divide(Binomial.binomial(n, k));
  }
}
