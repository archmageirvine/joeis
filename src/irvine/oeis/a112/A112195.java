package irvine.oeis.a112;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a058.A058604;
import irvine.oeis.transform.EulerTransform;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A112195 McKay-Thompson series of class 54d for the Monster group.
 * @author Georg Fischer
 */
public class A112195 extends Sequence0 {

  // sqrt(T27d), where T27d = A058604.
  private final InverseEulerTransform mIET = new InverseEulerTransform(new PrependSequence(1, new A058604())) {
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
