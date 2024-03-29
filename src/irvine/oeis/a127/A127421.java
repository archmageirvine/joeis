package irvine.oeis.a127;
// Generated by gen_seq4.pl simgcd/simgcdp at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001704;

/**
 * A127421 Numbers whose decimal expansion is a concatenation of 2 consecutive increasing nonnegative numbers.
 * @author Georg Fischer
 */
public class A127421 extends PrependSequence {

  /** Construct the sequence. */
  public A127421() {
    super(1, new A001704() {
      @Override
      public Z next() {
        return super.next();
      }
    }, 1);
  }
}
