package irvine.oeis.a140;
// Manually modified 2020-09-22

import irvine.oeis.transform.Stirling2TransformSequence;
import irvine.oeis.a005.A005651;

/**
 * A140585 Total number of all hierarchical orderings for all set partitions of n.
 * @author Georg Fischer
 */
public class A140585 extends Stirling2TransformSequence {

  /** Construct the sequence. */
  public A140585() {
    super(1, new A005651(), 0);
    next();
  }
}
