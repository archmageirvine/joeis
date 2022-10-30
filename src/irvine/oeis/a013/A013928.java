package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a008.A008966;

/**
 * A013928 Number of (positive) squarefree numbers &lt; n.
 * @author Sean A. Irvine
 */
public class A013928 extends PartialSumSequence {

  /** Construct the sequence. */
  public A013928() {
    super(1, new PrependSequence(new A008966(), Z.ZERO));
  }
}
