package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000004;
import irvine.oeis.transform.DhkTransformSequence;

/**
 * A032239 Number of identity bracelets of n beads of 2 colors.
 * @author Sean A. Irvine
 */
public class A032239 extends DhkTransformSequence {

  /** Construct the sequence. */
  public A032239() {
    super(new PrependSequence(new A000004(), Z.TWO));
    skip();
  }
}
