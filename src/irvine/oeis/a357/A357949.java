package irvine.oeis.a357;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A357949 a(n) = Sum_{k=0..floor(n/4)} (n-3*k)!/k!.
 * @author Georg Fischer
 */
public class A357949 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A357949() {
    super(0, "[[4],[-3],[-3],[-3],[-6,1],[-3,1],[-2,1],[-1,1],[-1]]", "1,1,2,6", 0);
  }
}
