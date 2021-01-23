package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a112.A112730;

/**
 * A036446 Not of form sigma(k)-phi(k).
 * @author Sean A. Irvine
 */
public class A036446 extends ComplementSequence {

  /** Construct the sequence. */
  public A036446() {
    super(new A112730(), Z.ONE);
  }
}
