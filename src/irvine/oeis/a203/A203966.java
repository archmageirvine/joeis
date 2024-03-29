package irvine.oeis.a203;
// Generated by gen_seq4.pl simgcd/simgcdp at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a050.A050474;

/**
 * A203966 Numbers n such that phi(n) divides n+1, where phi is Euler's totient function (A000010).
 * @author Georg Fischer
 */
public class A203966 extends PrependSequence {

  /** Construct the sequence. */
  public A203966() {
    super(1, new A050474() {
      {
        skip(1);
      }

      @Override
      public Z next() {
        return super.next();
      }
    }, 1, 2);
  }
}
