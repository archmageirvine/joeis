package irvine.oeis.a235;
// manually 2023-09-24/mult at 2023-09-24 21:44

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.MultiplicativeSequence;

/**
 * A235027 Reverse the bits of prime divisors of n (with 2 -&gt; 2), and multiply together: a(0)=0, a(1)=1, a(2)=2, a(p) = revbits(p) for odd primes p, a(u*v) = a(u) * a(v) for composites.
 * @author Georg Fischer
 */
public class A235027 extends MultiplicativeSequence implements DirectSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A235027() {
    super(0, (p, e) -> p.equals(Z.TWO) ? p.pow(e) : Functions.REVERSE.z(2, p).pow(e));
  }

  @Override
  public Z a(final Z n) {
    return n.isZero() ? Z.ZERO : super.a(n);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}

