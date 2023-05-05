package irvine.oeis.a327;
// manually partprod at 2023-05-04 20:46

import irvine.math.z.Z;
import irvine.oeis.PartialProductSequence;
import irvine.oeis.a001.A001222;

/**
 * A327486 Product of Omegas of positive integers from 2 to n.
 * @author Georg Fischer
 */
public class A327486 extends PartialProductSequence {

  /** Construct the sequence. */
  public A327486() {
    super(new A001222() {
      private int mN = 0;

      @Override
      public Z next() {
        final Z result = super.next();
        return (++mN == 1) ? Z.ONE : result;
      }
    });
  }
}
