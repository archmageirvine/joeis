package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;
import irvine.oeis.PrependSequence;

/**
 * A064509 Marks (in fathoms) on lead line used by ships on the Mississippi River.
 * @author Sean A. Irvine
 */
public class A064509 extends PrependSequence {

  /** Construct the sequence. */
  public A064509() {
    super(1, new LambdaSequence(4, k -> Z.valueOf(5L * k)), 2, 3, 5, 7, 10, 13, 15, 17);
  }
}
