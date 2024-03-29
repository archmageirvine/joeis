package irvine.oeis.a345;
// Generated by gen_seq4.pl simgcd/simgcdp at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a057.A057821;

/**
 * A345014 a(n) is the least nonnegative integer k such that 2^n - k is a Sophie Germain prime.
 * @author Georg Fischer
 */
public class A345014 extends PrependSequence {

  /** Construct the sequence. */
  public A345014() {
    super(1, new A057821() {
      @Override
      public Z next() {
        return super.next().divide2().add(1);
      }
    }, 0);
  }
}
