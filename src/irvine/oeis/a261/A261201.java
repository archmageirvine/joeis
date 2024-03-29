package irvine.oeis.a261;
// Generated by gen_seq4.pl simgcd/simgcdp at 2023-08-14 15:24

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a055.A055011;

/**
 * A261201 Base-10 representation of A261200.
 * @author Georg Fischer
 */
public class A261201 extends PrependSequence {

  /** Construct the sequence. */
  public A261201() {
    super(1, new A055011() {
      @Override
      public Z next() {
        return super.next();
      }
    }, 1);
  }
}
