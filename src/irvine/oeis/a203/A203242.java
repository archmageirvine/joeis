package irvine.oeis.a203;

import irvine.oeis.HolonomicRecurrence;

/**
 * A203242 Second elementary symmetric function of the first n terms of (1, 3, 7, 15, 31, ...).
 * @author Georg Fischer
 */
public class A203242 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A203242() {
    super(2, "[[0],[1936,-1280],[-6180, 3064],[5760,-2562],[-2116, 881],[258,-103]", "3", 0);
  }
}
