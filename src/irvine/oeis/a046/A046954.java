package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a024.A024899;

/**
 * A046954.
 * @author Sean A. Irvine
 */
public class A046954 extends ComplementSequence {

  /** Construct the sequence. */
  public A046954() {
    super(new A024899(), Z.ZERO);
  }
}
