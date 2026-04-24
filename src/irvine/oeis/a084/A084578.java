package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A084578 Positive integers not found in A084577.
 * @author Sean A. Irvine
 */
public class A084578 extends ComplementSequence {

  /** Construct the sequence. */
  public A084578() {
    super(1, Z.ONE, new A084577());
  }
}

