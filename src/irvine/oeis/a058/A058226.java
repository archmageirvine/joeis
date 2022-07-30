package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A058226 Panconsummate numbers (consummate in all bases &gt;=2).
 * @author Sean A. Irvine
 */
public class A058226 extends ComplementSequence {

  /** Construct the sequence. */
  public A058226() {
    super(new A058225(), Z.ONE);
  }
}
