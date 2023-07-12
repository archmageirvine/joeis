package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A064470 The even subsequence of A064413, divided by 2.
 * @author Sean A. Irvine
 */
public class A064470 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A064470() {
    super(1, new A064469(), Z::divide2);
  }
}
