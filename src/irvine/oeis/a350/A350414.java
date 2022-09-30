package irvine.oeis.a350;
// manually holsig/holos at 2022-09-30 08:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A350414 a(1)=1; for n &gt; 1, a(n) = a(n-1) + (sum of odd-indexed digits of a(n-1)) - (sum of even-indexed digits of a(n-1)).
 * @author Georg Fischer
 */
public class A350414 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A350414() {
    super(1, "[0,1,-1,0,0,0,1,-1]", "1,2,4,8,16,21,20,18,25,28,34,35,37,41,38,43,42,40,36,39,45,46,48,52,49,54", 0);
  }
}
