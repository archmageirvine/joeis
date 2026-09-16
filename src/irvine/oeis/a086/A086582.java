package irvine.oeis.a086;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.ConvolutionSequence;
import irvine.oeis.FiniteSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A086582 First 2^n terms of the self-convolution generates the next 2^n terms of this sequence after the 2^n-th term, for all n&gt;=0, where a(0)=1.
 * @author Sean A. Irvine
 */
public class A086582 extends Sequence0 {

  private Z[] mA = {Z.ONE};
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN >= mA.length) {
      final Sequence s = new ConvolutionSequence(new FiniteSequence(mA));
      mA = Arrays.copyOf(mA, mA.length * 2);
      for (int k = mN; k < mA.length; ++k) {
        mA[k] = s.next();
      }
    }
    return mA[mN];
  }
}
