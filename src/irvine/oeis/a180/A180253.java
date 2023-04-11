package irvine.oeis.a180;
// manually sumdiv3/sumdiv at 2023-04-11 10:15

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A180253 Call two divisors of n adjacent if the larger is a prime times the smaller. a(n) is the sum of elements of all pairs of adjacent divisors of n.
 * @author Georg Fischer
 */
public class A180253 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A180253() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    // a(n) = sumdiv(n, d, d*sumdiv(d, p, isprime(p)*(1+1/p)));
    return Integers.SINGLETON.sumdiv(mN, d -> Rationals.SINGLETON.sumdiv(d, p -> Z.valueOf(p).isProbablePrime() ? Q.ONE.add(new Q(1, p)) : Q.ZERO).multiply(d).num());
  }
}
