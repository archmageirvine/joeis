package irvine.oeis.a326;

import irvine.oeis.a072.A072446;
import irvine.oeis.transform.InverseBinomialTransformSequence;

/**
 * A326877 Number of connectedness systems covering n vertices without singletons.
 * @author Sean A. Irvine
 */
public class A326877 extends InverseBinomialTransformSequence {

  /** Construct the sequence. */
  public A326877() {
    super(0, new A072446(), 0);
  }
}

