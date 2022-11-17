package irvine.oeis.a090;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A090337 Let b(0) = 1, b(n) = b(n-1) + (-1)^(n-1)*b(n-1)/10; sequence gives numerator of b(n).
 * @author Georg Fischer
 */
public class A090337 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A090337() {
    super(1, "[[0],[99],[0],[-1]]", "1, 11, 99", 0);
  }
}
