package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A081062 Neither 3-smooth numbers nor prime powers.
 * @author Sean A. Irvine
 */
public class A081062 extends ComplementSequence {

  /** Construct the sequence. */
  public A081062() {
    super(1, Z.TEN, new A081061());
  }
}
