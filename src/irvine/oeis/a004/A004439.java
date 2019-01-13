package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A004439.
 * @author Sean A. Irvine
 */
public class A004439 extends ComplementSequence {

  /** Construct the sequence. */
  public A004439() {
    super(new A004431(), Z.ONE);
  }
}
