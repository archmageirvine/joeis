package irvine.oeis.a131;
// Generated by gen_seq4.pl simgcd/simgcdp at 2023-08-12 22:14

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a006.A006336;

/**
 * A131882 a(0)=1; thereafter a(n)=a(n-1)+a([n/Phi]), where Phi=(1+sqrt(5))/2, the golden ratio.
 * @author Georg Fischer
 */
public class A131882 extends PrependSequence {

  /** Construct the sequence. */
  public A131882() {
    super(0, new A006336() {
      @Override
      public Z next() {
        return super.next().multiply2();
      }
    }, 1);
  }
}
