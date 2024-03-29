package irvine.oeis.a349;
// Generated by gen_seq4.pl simgcd/simgcdp at 2023-08-27 22:03

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a054.A054377;

/**
 * A349193 1-Sondow numbers: numbers j such that p divides j/p + 1 for every prime divisor p of j.
 * @author Georg Fischer
 */
public class A349193 extends PrependSequence {

  /** Construct the sequence. */
  public A349193() {
    super(1, new A054377() {
      @Override
      public Z next() {
        return super.next();
      }
    }, 1);
  }
}
