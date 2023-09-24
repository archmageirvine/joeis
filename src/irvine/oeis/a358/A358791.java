package irvine.oeis.a358;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A358791 a(n) = n!*Sum_{m=0..floor(n/2)} binomial(n,2*m)^(-1).
 * @author Georg Fischer
 */
public class A358791 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A358791() {
    super(0, "[[0],[0,0,0,8,-14,1,8,-3],[0,0,0,16,-12,-10,6],[0,8,-4,-14,1,3],[0,-16,24,4,-6]]", "1,1,4", 0);
  }
}
