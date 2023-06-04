package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a000.A000142;

/**
 * A063992 Numbers that are not factorials.
 * @author Sean A. Irvine
 */
public class A063992 extends ComplementSequence {

  /** Construct the sequence. */
  public A063992() {
    super(new A000142(), Z.ONE);
  }
}
