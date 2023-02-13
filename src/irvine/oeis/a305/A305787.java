package irvine.oeis.a305;
// manually ietman at 2023-02-12 21:36

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A305787 Inverse Euler transform of (-n)^n.
 * @author Georg Fischer
 */
public class A305787 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A305787() {
    super(1, new Sequence1() {
      private int mN = 0;

      @Override
      public Z next() {
        ++mN;
        return Z.valueOf(-mN).pow(mN);
      }
    });
  }
}
