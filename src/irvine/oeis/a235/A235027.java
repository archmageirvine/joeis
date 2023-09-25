package irvine.oeis.a235;
// manually 2023-09-24/mult at 2023-09-24 21:44

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.MultiplicativeSequence;

/**
 * A235027 Reverse the bits of prime divisors of n (with 2 -&gt; 2), and multiply together: a(0)=0, a(1)=1, a(2)=2, a(p) = revbits(p) for odd primes p, a(u*v) = a(u) * a(v) for composites.
 * @author Georg Fischer
 */
public class A235027 extends MultiplicativeSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A235027() {
    super(0, (p, e) -> p.equals(Z.TWO) ? p.pow(e) : ZUtils.reverse(p, 2).pow(e));
  }

  @Override
  public Z next() {
    final Z result = super.next();
    return (++mN == 0) ? Z.ZERO : result;
  }
}

