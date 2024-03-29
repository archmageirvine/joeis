package irvine.oeis.a163;
// Generated by gen_seq4.pl simgcd/simgcdp at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002496;

/**
 * A163588 Primes which are within 1 of a square number.
 * @author Georg Fischer
 */
public class A163588 extends PrependSequence {

  /** Construct the sequence. */
  public A163588() {
    super(1, new A002496() {
      {
        skip(1);
      }

      @Override
      public Z next() {
        return super.next();
      }
    }, 2, 3);
  }
}
