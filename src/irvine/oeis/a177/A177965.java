package irvine.oeis.a177;
// Generated by gen_seq4.pl simgcd/simgcdp at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002476;

/**
 * A177965 Indices m for which A177961(m) - m = 1.
 * @author Georg Fischer
 */
public class A177965 extends PrependSequence {

  /** Construct the sequence. */
  public A177965() {
    super(1, new A002476() {
      @Override
      public Z next() {
        return super.next().divide2().add(1);
      }
    }, 1);
  }
}
