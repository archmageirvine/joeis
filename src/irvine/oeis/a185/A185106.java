package irvine.oeis.a185;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A185106 Column 4 of A181783.
 * <code>a(n)= (6n+1)*a(n-1) -(11n+6)*(n-1)*a(n-2)*a(n-3) -6*(n-1)*(n-2)*(n-3)*a(n-4)</code>.
 * @author Georg Fischer
 */
public class A185106 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A185106() {
    super(0, "[[0],[36,-66, 36,-6],[22,-21,-7, 6],[6, 5,-11],[1, 6],[-1]", "1, 7, 63, 709", 0);
  }
}
