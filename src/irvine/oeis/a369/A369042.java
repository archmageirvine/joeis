package irvine.oeis.a369;
// Generated by gen_seq4.pl dirtraf at 2024-02-05 19:10

import irvine.oeis.a006.A006068;
import irvine.oeis.a014.A014963;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A369042 LCM-transform of the inverse of binary Gray code (A006068).
 * @author Georg Fischer
 */
public class A369042 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A369042() {
    super(1, new A014963(), new A006068());
  }
}
