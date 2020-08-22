package irvine.oeis.a026;

import irvine.oeis.EulerTransformSequence;

/**
 * A026007 Expansion of Product_{m&gt;=1} (1 + q^m)^m; number of partitions of n into distinct parts, where n different parts of size n are available.
 * @author Sean A. Irvine
 */
public class A026007 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A026007() {
    super(new A026741(), 1);
  }
}
