package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Stirling1TransformSequence;
import irvine.oeis.a006.A006351;

/**
 * A007834.
 * @author Sean A. Irvine
 */
public class A007834 extends Stirling1TransformSequence {

  /** Construct the sequence. */
  public A007834() {
    super(new PrependSequence(new A006351(), Z.ONE), -1);
  }
}
