package irvine.oeis.a156;
// manually etman at 2023-02-06 12:43

import irvine.math.z.Z;
import irvine.oeis.a065.A065958;
import irvine.oeis.transform.EulerTransform;

/**
 * A156733 Euler transform of n*A065958(n).
 * @author Georg Fischer
 */
public class A156733 extends EulerTransform {

  /** Construct the sequence. */
  public A156733() {
    super(0, new A065958() {
      private int mN = 0;

      public Z next() {
        ++mN;
        return super.next().multiply(mN);
      }
    }, 1);
  }
}
