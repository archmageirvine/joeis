package irvine.oeis.a191;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A191662 a(n) = n! / A000034(n-1).
 * @author Georg Fischer
 */
public class A191662 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A191662() {
    super(1, "[[0],[0,1,-1],[0],[1]]", "1,1", 0);
  }
}
