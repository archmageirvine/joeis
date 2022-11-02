package irvine.oeis.a106;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A106271 Row sums of number triangle A106270.
 * @author Georg Fischer
 */
public class A106271 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A106271() {
    super(0, "[[0],[-2, 4],[1,-5],[1, 1]]", "1, 0", 0);
  }
}
