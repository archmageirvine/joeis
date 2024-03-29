package irvine.oeis.a328;
// Generated by gen_seq4.pl simgcd/simgcdp at 2023-08-14 15:24

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a059.A059010;

/**
 * A328012 Numbers whose binary representations start and end with 1 and contain an even number of zeros between.
 * @author Georg Fischer
 */
public class A328012 extends PrependSequence {

  /** Construct the sequence. */
  public A328012() {
    super(1, new A059010() {
      @Override
      public Z next() {
        return super.next().multiply2().add(1);
      }
    }, 1);
  }
}
