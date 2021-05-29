package irvine.oeis.a302;
// manually

import irvine.oeis.HolonomicRecurrence;

/**
 * A302139 Numbers n such that A111336(n) = 4.
 * @author Georg Fischer
 */
public class A302139 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A302139() {
    super(1, "[[0],[-2],[1]]", "8, 12, 16, 20, 24, 32, 64, 120, 128, 256, 512, 600, 1024", 0);
  }
}
