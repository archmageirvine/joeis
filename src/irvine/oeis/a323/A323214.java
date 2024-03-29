package irvine.oeis.a323;
// Generated by gen_seq4.pl simgcd/simgcdp at 2023-08-27 22:03

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002997;

/**
 * A323214 Composite numbers k such that p^(k-1) == 1 (mod k) for every prime p strongly prime to k.
 * @author Georg Fischer
 */
public class A323214 extends PrependSequence {

  /** Construct the sequence. */
  public A323214() {
    super(1, new A002997() {
      @Override
      public Z next() {
        return super.next();
      }
    }, 4, 6);
  }
}
