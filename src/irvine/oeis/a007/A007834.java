package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a006.A006351;
import irvine.oeis.transform.Stirling1TransformSequence;

/**
 * A007834 Number of point labeled reduced 5-free two-graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A007834 extends Stirling1TransformSequence {

  /** Construct the sequence. */
  public A007834() {
    super(new PrependSequence(new A006351(), Z.ONE), -1);
  }
}
