package irvine.oeis.a089;
// Generated by gen_seq4.pl simgcd/simgcdp at 2023-08-27 22:03

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a219.A219544;

/**
 * A089748 Numbers k that divide (sum of proper divisors of k + product of proper divisors of k).
 * @author Georg Fischer
 */
public class A089748 extends PrependSequence {

  /** Construct the sequence. */
  public A089748() {
    super(1, new A219544() {
      @Override
      public Z next() {
        return super.next().multiply2();
      }
    }, 2);
  }
}
