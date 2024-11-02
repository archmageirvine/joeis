package irvine.oeis.a081;

import irvine.oeis.ComplementSequence;
import irvine.oeis.a072.A072795;

/**
 * A081291 Complement of A072795.
 * @author Sean A. Irvine
 */
public class A081291 extends ComplementSequence {

  /** Construct the sequence. */
  public A081291() {
    super(0, new A072795());
  }
}

