package irvine.oeis.a075;

import irvine.oeis.AlternatingSequence;

/**
 * A070428.
 * @author Sean A. Irvine
 */
public class A075323 extends AlternatingSequence {

  /** Construct the sequence. */
  public A075323() {
    super(1, new A075321(), new A075322());
  }
}
