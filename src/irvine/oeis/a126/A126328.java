package irvine.oeis.a126;
// Generated by gen_seq4.pl simgcd/simgcdp at 2023-08-27 22:03

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a061.A061370;

/**
 * A126328 Rounded value of n!/(n(n+1)/2); A000142(n)/A000217(n).
 * @author Georg Fischer
 */
public class A126328 extends PrependSequence {

  /** Construct the sequence. */
  public A126328() {
    super(1, new A061370() {
      {
        skip(2);
      }

      @Override
      public Z next() {
        return super.next();
      }
    }, 1, 1);
  }
}
