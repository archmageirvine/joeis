package irvine.oeis.a134;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000757;
import irvine.oeis.triangle.Triangle;

/**
 * A134832 Triangle of succession numbers for circular permutations.
 * a(n,k) = binomial(n,k)*a(n-k, 0), k&gt;=1 with a(n-k, 0):=A000757(n), n&gt;=0.
 * @author Georg Fischer
 */
public class A134832 extends Triangle {

  protected Sequence mSeq;

  /** Construct the sequence. */
  public A134832() {
    mSeq = new A000757();
  }

  @Override
  public Z compute(final int n, final int k) {
    return k == 0 ? mSeq.next() : get(n - k, 0).multiply(Binomial.binomial(n, k));
  }
}
