package irvine.oeis.a164;
// Generated by gen_seq4.pl simgcd/simgcdp at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a007.A007663;

/**
 * A164740 (2^p-(p+2))/p as p runs through the primes.
 * @author Georg Fischer
 */
public class A164740 extends PrependSequence {

  /** Construct the sequence. */
  public A164740() {
    super(1, new A007663() {
      @Override
      public Z next() {
        return super.next().multiply2().subtract(1);
      }
    }, 0);
  }
}
