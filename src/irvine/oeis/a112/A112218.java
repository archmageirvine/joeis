package irvine.oeis.a112;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a058.A058704;
import irvine.oeis.transform.EulerTransform;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A112218 McKay-Thompson series of class 102a for the Monster group.
 * @author Georg Fischer
 */
public class A112218 extends Sequence0 {

  // sqrt(2 + T51A) in powers of q, where T51A = A058704
  private final InverseEulerTransform mIET = new InverseEulerTransform(new PrependSequence(2, new A058704(), 2)) {
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
