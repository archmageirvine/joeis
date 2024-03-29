package irvine.oeis.a147;
// Generated by gen_seq4.pl simgcd/simgcdp at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a032.A032925;

/**
 * A147992 Sequence S such that 1 is in S and if x is in S, then 4x-1 and 4x+1 are in S.
 * @author Georg Fischer
 */
public class A147992 extends PrependSequence {

  /** Construct the sequence. */
  public A147992() {
    super(1, new A032925() {
      @Override
      public Z next() {
        return super.next().multiply2().add(1);
      }
    }, 1);
  }
}
