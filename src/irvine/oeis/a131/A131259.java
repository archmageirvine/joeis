package irvine.oeis.a131;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A131259 a(2n)=A000217(n), a(2n+1)=-2*A000217(n).
 * @author Georg Fischer
 */
public class A131259 extends HolonomicRecurrence {

  public A131259() {
    super(0, "[0, 1, 0,-3, 0, 3, 0,-1]", "0, 0, 1,-2", 0);
  }
}
