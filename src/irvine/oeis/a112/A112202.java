package irvine.oeis.a112;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a058.A058626;
import irvine.oeis.transform.EulerTransform;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A112202 McKay-Thompson series of class 60d for the Monster group.
 * @author Georg Fischer
 */
public class A112202 extends Sequence0 {

  // T60d = sqrt(T30e-2), where T30e = A058626.
  private final InverseEulerTransform mIET = new InverseEulerTransform(new PrependSequence(2, new A058626(), -2)) {
    @Override
    public Z next() {
      return super.next().divide2();
    }
  };
  private final EulerTransform mET = new EulerTransform(0, mIET, 1);

  @Override
  public Z next() {
    return mET.next();
  }
}
