package irvine.oeis.a358;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A358494 a(n) = Sum_{k=0..floor(n/5)} (n-4*k)!/k!.
 * @author Georg Fischer
 */
public class A358494 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A358494() {
    super(0, "[[5],[-4],[-4],[-4],[-4],[-8,1],[-4,1],[-3,1],[-2,1],[-1,1],[-1]]", "1,1,2,6,24", 0);
  }
}
