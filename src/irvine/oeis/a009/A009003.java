package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a004.A004144;

/**
 * A009003 Hypotenuse numbers (squares are sums of 2 nonzero squares).
 * @author Sean A. Irvine
 */
public class A009003 extends ComplementSequence {

  /** Construct the sequence. */
  public A009003() {
    super(Z.ONE, new A004144());
  }
}
