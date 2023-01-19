package irvine.oeis.a112;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a058.A058513;
import irvine.oeis.transform.EulerTransform;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A112170 McKay-Thompson series of class 30f for the Monster group.
 * @author Georg Fischer
 */
public class A112170 extends Sequence0 {

  // sqrt(2 + T15b), where T15b = A058513.
  private final InverseEulerTransform mIET = new InverseEulerTransform(new PrependSequence(2, new A058513(), 2)) {
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
