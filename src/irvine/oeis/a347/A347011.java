package irvine.oeis.a347;
// manually etman at 2023-02-06 21:49

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.transform.EulerTransform;

/**
 * A347011 Euler transform of j-&gt; ceiling(2^(j-2)).
 * @author Georg Fischer
 */
public class A347011 extends EulerTransform {

  /** Construct the sequence. */
  public A347011() {
    super(0, new Sequence1() {
      private int mN = 0;

      public Z next() {
        ++mN;
        return (mN == 1) ? Z.ONE : Z.ONE.shiftLeft(mN - 2);
      }
    }, 1);
  }
}
