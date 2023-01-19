package irvine.oeis.a112;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a058.A058744;
import irvine.oeis.transform.EulerTransform;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A112224 McKay-Thompson series of class 140a for the Monster group.
 * @author Georg Fischer
 */
public class A112224 extends Sequence0 {

  // sqrt(T70A + 2) in powers of q, where T70A = A058744.
  private final InverseEulerTransform mIET = new InverseEulerTransform(new PrependSequence(2, new A058744(), 2)) {
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
