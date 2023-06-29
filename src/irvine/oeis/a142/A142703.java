package irvine.oeis.a142;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A142703 a(n) = 2*(n-1)*( a(n-1)+a(n-2) ) starting a(1)=a(2)=1.
 * @author Georg Fischer
 */
public class A142703 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A142703() {
    super(1, "[[0],[-2,2],[-2,2],[-1]]", "1,1", 0);
  }
}
