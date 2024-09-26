package irvine.oeis.a072;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A072329 a(n+1) = 3*a(n-2) + 2*a(n-1), a(n)=x^n+y^n+z^n.
 * @author Georg Fischer
 */
public class A072329 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A072329() {
    super(0, "[[0],[3],[2],[0],[-1]]", "3, 0, 4", 0);
  }

}
