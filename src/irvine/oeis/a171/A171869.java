package irvine.oeis.a171;
// manually 2021-05-29

import irvine.oeis.HolonomicRecurrence;

/**
 * A171869 a(n) is the period of A175555(n) in the sequence {A175555}.
 * @author Georg Fischer
 */
public class A171869 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A171869() {
    super(1, "[[0],[-2],[1]]", "1, 2, 2, 2, 2, 4, 8", 0);
  }
}
