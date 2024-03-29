package irvine.oeis.a291;
// Generated by gen_seq4.pl simgcd/simgcdp at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a244.A244430;

/**
 * A291286 a(0)=1, a(1)=2, thereafter a(n) = n*a(n-1)+(n-1)*(n-2)*a(n-2).
 * @author Georg Fischer
 */
public class A291286 extends PrependSequence {

  /** Construct the sequence. */
  public A291286() {
    super(0, new A244430() {
      {
        skip(1);
      }

      @Override
      public Z next() {
        return super.next().multiply2();
      }
    }, 1);
  }
}
