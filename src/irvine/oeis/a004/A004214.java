package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a000.A000408;

/**
 * A004214.
 * @author Sean A. Irvine
 */
public class A004214 extends ComplementSequence {

  /** Construct the sequence. */
  public A004214() {
    super(new A000408(), Z.ONE);
  }
}
