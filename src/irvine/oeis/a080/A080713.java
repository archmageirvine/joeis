package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a081.A081053;

/**
 * A080633
 * @author Sean A. Irvine
 */
public class A080713 extends ComplementSequence {

  /** Construct the sequence. */
  public A080713() {
    super(1, Z.ONE, new A081053());
  }
}
