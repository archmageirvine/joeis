package irvine.oeis.a112;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a058.A058670;
import irvine.oeis.transform.EulerTransform;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A112210 McKay-Thompson series of class 82a for the Monster group.
 * @author Georg Fischer
 */
public class A112210 extends Sequence0 {

  // T82a=rootn(T41A, 2), where T41A = A058670.
  private final InverseEulerTransform mIET = new InverseEulerTransform(new PrependSequence(1, new A058670())) {
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
