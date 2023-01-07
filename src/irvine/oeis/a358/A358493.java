package irvine.oeis.a358;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A358493 a(n) = Sum_{k=0..floor(n/3)} (n-2*k)!/k!.
 * @author Georg Fischer
 */
public class A358493 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A358493() {
    super(0, "[[3],[-2],[-2],[-4,1],[-2,1],[-1,1],[-1]]", "1,1,2", 0);
  }
}
