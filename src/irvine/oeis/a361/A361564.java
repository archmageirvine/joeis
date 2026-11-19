package irvine.oeis.a361;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.transform.EulerTransform;

/**
 * A361564 Number of (n-3)-connected unlabeled n-node graphs.
 * @author Gregory Morse
 */
public class A361564 extends EulerTransform {
  /** Construct the sequence. */
  public A361564() {
    // The complement is a union of paths and cycles, excluding 4-cycles.
    super(3, new Sequence1() {
      private int mN = 0;

      @Override
      public Z next() {
        return ++mN < 3 || mN == 4 ? Z.ONE : Z.TWO;
      }
    });
    skip(2);
  }
}
