package irvine.oeis.a236;
// Generated by gen_seq4.pl simgcd/simgcdp at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a060.A060991;

/**
 * A236565 The smallest values m such that A049820(x) = m has exactly n solutions.
 * @author Georg Fischer
 */
public class A236565 extends PrependSequence {

  /** Construct the sequence. */
  public A236565() {
    super(0, new A060991() {
      {
        skip(3);
      }

      @Override
      public Z next() {
        return super.next();
      }
    }, 7, 2, 0);
  }
}
