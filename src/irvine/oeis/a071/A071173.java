package irvine.oeis.a071;

import irvine.oeis.PrependSequence;
import irvine.oeis.a143.A143993;

/**
 * A071173 Nonprimes which terminate in their sum of prime factors.
 * @author Sean A. Irvine
 */
public class A071173 extends PrependSequence {

  /** Construct the sequence. */
  public A071173() {
    super(1, new A143993(), 1);
  }
}
