package irvine.oeis.a083;
// manually parity at 2023-07-10 07:08

import irvine.math.z.Z;
import irvine.oeis.a061.A061419;
import irvine.oeis.base.RunLengthSequence;

/**
 * A083279 Length of odd/even runs in A061419, where a(2n)=length of n-th run of even numbers in A061419 and a(2n-1)=length of n-th run of odd numbers.
 * @author Georg Fischer
 */
public class A083279 extends RunLengthSequence {

  /** Construct the sequence. */
  public A083279() {
    super(1, new A061419() {
      @Override
      public Z next() {
        return super.next().testBit(0) ? Z.ONE : Z.ZERO;
      }
    });
  }
}
