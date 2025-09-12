package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a024.A024899;

/**
 * A046954 Numbers k such that 6*k + 1 is nonprime.
 * @author Sean A. Irvine
 */
public class A046954 extends ComplementSequence {

  /** Construct the sequence. */
  public A046954() {
    super(Z.ZERO, new A024899());
  }
}
