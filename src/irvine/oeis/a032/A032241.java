package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000004;
import irvine.oeis.transform.DhkTransformSequence;

/**
 * A032241 Number of identity bracelets of n beads of 4 colors.
 * @author Sean A. Irvine
 */
public class A032241 extends SkipSequence {

  /** Construct the sequence. */
  public A032241() {
    super(1, new DhkTransformSequence(new PrependSequence(new A000004(), Z.FOUR)), 1);
  }
}
