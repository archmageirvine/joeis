package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a024.A024898;

/**
 * A046953 Numbers k such that 6*k - 1 is composite.
 * @author Sean A. Irvine
 */
public class A046953 extends ComplementSequence {

  /** Construct the sequence. */
  public A046953() {
    super(new A024898(), Z.ONE);
  }
}
