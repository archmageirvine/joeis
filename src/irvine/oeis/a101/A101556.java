package irvine.oeis.a101;
// manually convprom/convprod at 2023-02-24 12:03

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a010.A010060;


/**
 * A101556 A Thue-Morse convolution.
 * @author Georg Fischer
 */
public class A101556 extends Sequence0 {

  private final A010060 mSeq = new A010060();
  private final StringBuilder mSb = new StringBuilder();

  @Override
  public Z next() {
    mSb.append(mSeq.next().toString());
    return new Z(mSb.toString());
  }
}
