package irvine.oeis.a123;
// manually holos 2021-08-17

import irvine.oeis.HolonomicRecurrence;

/**
 * A123351 Kekul\u00e9 numbers for certain benzenoids (see the Cyvin-Gutman book for details).
 * a(n)=n^6+6*n^5+22*n^4+30*n^3+49*n^2+36)/36
 * @author Georg Fischer
 */
public class A123351 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A123351() {
    super(0, "[[36, 0, 49, 30, 22, 6, 1],[-36]]", "1", 0);
  }
}
