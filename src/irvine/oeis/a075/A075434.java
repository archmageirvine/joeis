package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a070.A070049;

/**
 * A073524.
 * @author Sean A. Irvine
 */
public class A075434 extends ComplementSequence {

  /** Construct the sequence. */
  public A075434() {
    super(new A070049(), Z.ONE);
  }
}
