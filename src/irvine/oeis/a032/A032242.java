package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.DhkTransformSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000004;

/**
 * A032242 Number of identity bracelets of n beads of 5 colors.
 * @author Sean A. Irvine
 */
public class A032242 extends DhkTransformSequence {

  {
    next();
  }

  /** Construct the sequence. */
  public A032242() {
    super(new PrependSequence(new A000004(), Z.FIVE));
  }
}
