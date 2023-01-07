package irvine.oeis.a358;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A358499 a(n) = Sum_{k=0..floor(n/4)} (n-4*k)!.
 * @author Georg Fischer
 */
public class A358499 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A358499() {
    super(0, "[[0],[0,-1],[1],[0],[0],[0,1],[-1]]", "1", 0);
  }
}
