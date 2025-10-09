package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A080910.
 * @author Sean A. Irvine
 */
public class A081001 extends ComplementSequence {

  /** Construct the sequence. */
  public A081001() {
    super(1, Z.ONE, new A081000());
  }
}

