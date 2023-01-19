package irvine.oeis.a112;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a058.A058614;
import irvine.oeis.transform.EulerTransform;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A112200 McKay-Thompson series of class 60a for the Monster group.
 * @author Georg Fischer
 */
public class A112200 extends Sequence0 {

  // sqrt(T30C), where T30C = A058614
  private final InverseEulerTransform mIET = new InverseEulerTransform(new PrependSequence(1, new A058614())) {
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
