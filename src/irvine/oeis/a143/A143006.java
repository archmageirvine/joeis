package irvine.oeis.a143;

import irvine.oeis.HolonomicRecurrence;

/**
 * A143006 a(0) = 0, a(1) = 1, a(n+1) = (2*n+1)*(n^2+n+41)*a(n) - n^6*a(n-1).
 * @author Georg Fischer
 */
public class A143006 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A143006() {
    super(0, "[[0],[0, 0, 0, 0, 0, 0, 1],[-41,-83,-3,-2],[1]]", "[0, 1]", 1);
  }
}
