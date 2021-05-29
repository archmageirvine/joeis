package irvine.oeis.a067;
// manually 2021-05-29

import irvine.oeis.HolonomicRecurrence;

/**
 * A067636 Row 1 of table in A067640.
 * @author Georg Fischer
 */
public class A067636 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A067636() {
    super(0, "[[0],[-12,-44,-48,-16],[0, 6, 5, 1]]", "2", 0);
  }
}
