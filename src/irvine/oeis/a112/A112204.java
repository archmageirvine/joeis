package irvine.oeis.a112;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a058.A058563;
import irvine.oeis.transform.EulerTransform;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A112204 McKay-Thompson series of class 63a for the Monster group.
 * @author Georg Fischer
 */
public class A112204 extends Sequence0 {

  // T63a = (q*T21A)^(1/3), where T21A = A058563.
  private final InverseEulerTransform mIET = new InverseEulerTransform(new PrependSequence(1, new A058563())) {
    @Override
    public Z next() {
      return super.next().divide(3);
    }
  };
  private final EulerTransform mET = new EulerTransform(0, mIET, 1);

  @Override
  public Z next() {
    return mET.next();
  }
}
