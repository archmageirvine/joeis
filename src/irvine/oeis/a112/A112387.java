package irvine.oeis.a112;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A112387 a(1)=1, a(2)=2, a(n)= 2^(n/2) if even and a(n-1)-a(n-2) if odd.
 * @author Georg Fischer
 */
public class A112387 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A112387() {
    super(0, "[0, 2, 0, 1, 0,-1]", "1, 1, 2, 1, 4, 3", 0);
  }
}
