package irvine.oeis.a110;
// Generated by gen_seq4.pl simgcd/simgcdp at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a065.A065545;

/**
 * A110930 a(1) = 1; a(n) = nextprime(2*a(n-1)) for n &gt; 1.
 * @author Georg Fischer
 */
public class A110930 extends PrependSequence {

  /** Construct the sequence. */
  public A110930() {
    super(1, new A065545() {
      @Override
      public Z next() {
        return super.next();
      }
    }, 1);
  }
}
