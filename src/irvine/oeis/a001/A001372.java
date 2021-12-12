package irvine.oeis.a001;

import irvine.oeis.transform.EulerTransformSequence;
import irvine.oeis.a002.A002861;

/**
 * A001372 Number of mappings (or mapping patterns) from n points to themselves; number of endofunctions.
 * @author Sean A. Irvine
 */
public class A001372 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A001372() {
    super(new A002861(), 0);
  }
}
