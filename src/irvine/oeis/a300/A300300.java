package irvine.oeis.a300;
// manually etman at 2023-02-06 12:43

import irvine.math.z.Z;
import irvine.oeis.a000.A000009;
import irvine.oeis.transform.EulerTransform;

/**
 * A300300 Number of ways to choose a multiset of strict partitions, or odd partitions, of odd numbers, whose weights sum to n.
 * @author Georg Fischer
 */
public class A300300 extends EulerTransform {

  /** Construct the sequence. */
  public A300300() {
    super(0, new A000009() {
      private int mN = -1;

      {
        super.next();
      }

      public Z next() {
        ++mN;
        final Z t = super.next();
        return ((mN & 1) == 0) ? t : Z.ZERO;
      }
    }, 1);
  }
}
