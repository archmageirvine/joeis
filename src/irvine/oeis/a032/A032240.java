package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.DhkTransformSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000004;

/**
 * A032240 Number of identity bracelets of n beads of 3 colors.
 * @author Sean A. Irvine
 */
public class A032240 extends SkipSequence {

  /** Construct the sequence. */
  public A032240() {
    super(new DhkTransformSequence(new PrependSequence(new A000004(), Z.THREE)), 1);
  }
}
