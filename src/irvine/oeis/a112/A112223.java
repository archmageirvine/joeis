package irvine.oeis.a112;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a058.A058739;
import irvine.oeis.transform.EulerTransform;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A112223 McKay-Thompson series of class 132a for the Monster group.
 * @author Georg Fischer
 */
public class A112223 extends Sequence0 {

  // sqrt(T66A) in powers of q, where T66A = A058739. 
  private final InverseEulerTransform mIET = new InverseEulerTransform(new PrependSequence(1, new A058739())) {
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
