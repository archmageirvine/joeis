package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000004;
import irvine.oeis.transform.DhkTransformSequence;

/**
 * A032240 Number of identity bracelets of n beads of 3 colors.
 * @author Sean A. Irvine
 */
public class A032240 extends DhkTransformSequence {

  /** Construct the sequence. */
  public A032240() {
    super(new PrependSequence(new A000004(), Z.THREE));
    skip();
  }
}
