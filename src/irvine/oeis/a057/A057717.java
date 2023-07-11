package irvine.oeis.a057;

import irvine.oeis.ComplementSequence;
import irvine.oeis.a011.A011557;

/**
 * A057717 The non-powers of 10.
 * @author Sean A. Irvine
 */
public class A057717 extends ComplementSequence {

  /** Construct the sequence. */
  public A057717() {
    super(0, new A011557());
  }
}
