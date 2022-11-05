package irvine.oeis.a176;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A176287 Diagonal sums of number triangle A092392.
 * @author Georg Fischer
 */
public class A176287 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A176287() {
    // 2*n*a(n) +(6-11*n)*a(n-1) +(13*n-16)*a(n-2) +2*(5-n)*a(n-3) +3*(2-3*n)*a(n-4) +2*(2*n-5)*a(n-5)=0.
    super(0, "[[0],[-10,4],[6,-9],[10,-2],[-16,13],[6,-11],[0,2]]", "1,2,7,23", 0);
  }
}
