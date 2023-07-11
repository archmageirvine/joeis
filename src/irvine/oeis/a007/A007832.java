package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.transform.Stirling2TransformSequence;

/**
 * A007832 Number of point labeled 5,6-free two-graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A007832 extends Stirling2TransformSequence {

  /** Construct the sequence. */
  public A007832() {
    super(1, new PrependSequence(new A007831(), Z.ZERO), 0);
    next();
  }
}
