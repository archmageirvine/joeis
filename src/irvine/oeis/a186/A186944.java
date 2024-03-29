package irvine.oeis.a186;
// Generated by gen_seq4.pl simgcd/simgcdp at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a034.A034386;

/**
 * A186944 Geometric mean of n-th row of A080508.
 * @author Georg Fischer
 */
public class A186944 extends PrependSequence {

  /** Construct the sequence. */
  public A186944() {
    super(1, new A034386() {
      {
        skip(2);
      }

      @Override
      public Z next() {
        return super.next();
      }
    }, 1, 2);
  }
}
