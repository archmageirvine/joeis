package irvine.oeis.a102;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A102038 a(n+1) = n*a(n) + a(n-1), a(0)=1, a(1)=1.
 * @author Georg Fischer
 */
public class A102038 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A102038() {
    super(0, "[[0],[-1],[0,-1],[1]]", "[1,1,2]", 1);
  }
}
