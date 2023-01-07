package irvine.oeis.a358;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A358609 a(n) = Sum_{k=0..floor(n/4)} (-1)^k * (n-4*k)!.
 * @author Georg Fischer
 */
public class A358609 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A358609() {
    super(0, "[[0],[0,1],[-1],[0],[0],[0,1],[-1]]", "1", 0);
  }
}
