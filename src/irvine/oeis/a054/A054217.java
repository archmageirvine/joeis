package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A054217 Primes p with property that p concatenated with its emirp p' (prime reversal) forms a palindromic prime of the form 'primemirp' (rightmost digit of p and leftmost digit of p' are blended together - p and p' palindromic allowed).
 * @author Sean A. Irvine
 */
public class A054217 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z r = Functions.REVERSE.z(p);
      if (mPrime.isPrime(r) && new Z(p.toString() + r.toString().substring(1)).isProbablePrime()) {
        return p;
      }
    }
  }
}

