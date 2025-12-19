package irvine.oeis.a390;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a034.A034961;
import irvine.oeis.a166.A166039;

/**
 * A390613 allocated for Robert Israel.
 * @author Sean A. Irvine
 */
public class A390613 extends IntersectionSequence {

  /** Construct the sequence. */
  public A390613() {
    super(new A034961(), new A166039());
  }
}
