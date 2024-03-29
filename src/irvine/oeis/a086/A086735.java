package irvine.oeis.a086;
// Generated by gen_seq4.pl convprom/convprod at 2023-07-10 14:24

import irvine.math.z.Z;
import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000010;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000203;

/**
 * A086735 Convolution of the prime numbers with phi(n) convoluted with sigma(n).
 * @author Georg Fischer
 */
public class A086735 extends ConvolutionSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A086735() {
    super(0, new ConvolutionSequence(0, new A000040(), new A000010()), new A000203());
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ZERO;
    }
    return super.next();
  }
}
