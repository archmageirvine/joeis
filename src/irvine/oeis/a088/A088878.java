package irvine.oeis.a088;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A088878 Prime numbers p such that 3p - 2 is a prime.
 * Superclass for "mother|father|daughter|son" primes.
 * @author Georg Fischer
 */
public class A088878 extends A000040 {

  private int mSign;
  private boolean mParent;
  private int mOrder2;
  private Z mOrder21;

  /** Construct the sequence. */
  public A088878() {
    this(1, 2, 1);
  }

  /**
   * Generic constructor with parameters
   * @param sign 1 = add, -1 = subtract 2*order
   * @param parent 1 = yield parent, 2 = yield child
   * @param order base factor
   */
  public A088878(final int sign, final int parent, final int order) {
    mSign = sign;
    mParent = parent == 1;
    mOrder2 = 2 * order;
    mOrder21 = Z.valueOf(mOrder2 + 1);
  }

/* Mathematica:
  A136062 Mother primes of order 3.   n = 3; a = {}; Do[If[PrimeQ[(Prime[k] + 2n)/(2n + 1)], AppendTo[a, Prime[k]]], {k, 1, 1500}]; a
  A136071 Father primes of order 2.   n = 2; a = {}; Do[If[PrimeQ[(Prime[k] - 2n)/(2n + 1)], AppendTo[a, Prime[k]]], {k, 1, 1500}]; a
  A136052 Daughter primes of order 3. n = 3; a = {}; Do[If[PrimeQ[(Prime[k] + 2n)/(2n + 1)], AppendTo[a, (Prime[k] + 2n)/(2n + 1)]], {k, 1, 1500}]; a
  A136082 Son primes of order 5.      n = 5; a = {}; Do[If[PrimeQ[(Prime[k] - 2n)/(2n + 1)], AppendTo[a, (Prime[k] - 2n)/(2n + 1)]], {k, 1, 1000}]; a
*/
  @Override
  public Z next() {
    while (true) {
      final Z prime = super.next();
      final Z prime2 = prime.add(mOrder2 * mSign);
      if (prime2.mod(mOrder21).equals(Z.ZERO)) {
        final Z prime21 = prime2.divide(mOrder21);
        if (prime21.isPrime()) {
          return mParent ? prime : prime21;
        }
      }
    }
  }
}
