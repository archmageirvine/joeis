package irvine.oeis.a109;
// Generated by gen_seq4.pl simgcd/simgcdp at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;

/**
 * A109845 a(1) = 2; a(2n) = least common multiple of all previous terms + 1. a(2n+1) = least common multiple of all previous terms - 1.
 * @author Georg Fischer
 */
public class A109845 extends PrependSequence {

  /** Construct the sequence. */
  public A109845() {
    super(1, new A109173() {
      {
        skip(1);
      }

      @Override
      public Z next() {
        return super.next();
      }
    }, 2);
  }
}
