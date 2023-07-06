package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000004;
import irvine.oeis.transform.DhkTransformSequence;

/**
 * A032242 Number of identity bracelets of n beads of 5 colors.
 * @author Sean A. Irvine
 */
public class A032242 extends DhkTransformSequence {

  /** Construct the sequence. */
  public A032242() {
    super(new PrependSequence(new A000004(), Z.FIVE));
    skip();
  }
}
