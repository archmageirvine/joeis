package irvine.oeis.a178;
// manually 2022-12-26

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a122.A122836;

/**
 * A178689 Partial sums of A122836 (number of topologies on n labeled elements in which at least one element belongs to some pair of noncomparable members of the topology).
 * @author Georg Fischer
 */
public class A178689 extends PartialSumSequence {

  /** Construct the sequence. */
  public A178689() {
    super(0, new A122836());
  }
}
