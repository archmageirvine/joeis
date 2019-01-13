package irvine.oeis.a012;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a027.A027861;

/**
 * A012132.
 * @author Sean A. Irvine
 */
public class A012132 extends ComplementSequence {

  /** Construct the sequence. */
  public A012132() {
    super(new A027861(), Z.ONE);
  }
}
