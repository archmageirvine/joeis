package irvine.oeis.a130;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A130710 A designed sequence of primes that seems to be chaotic based on the sum of the sequence with a prime and one: a(n+1)-&gt;Abs(a(n)+Prime[n]+1).
 * @author Sean A. Irvine
 */
public class A130710 extends FilterSequence {

  /** Construct the sequence. */
  public A130710() {
    super(1, new A000040() {
      private int mN = -1;
      private Z mA = Z.valueOf(13);

      @Override
      public Z next() {
        switch (++mN) {
          case 0:
            return Z.TWO;
          case 1:
            return Z.SEVEN;
          case 2:
            super.next(); // consume 2
            return Z.valueOf(13);
          default:
            mA = mA.subtract(super.next()).add(1).abs();
            return mA;
        }
      }
    }, Predicates.PRIME::is);
  }
}

