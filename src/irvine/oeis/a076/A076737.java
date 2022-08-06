package irvine.oeis.a076;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A076737 Let u(1)=u(2)=u(3)=2, u(n)=(1+u(n-1)u(n-2))/u(n-3); then a(n) is the numerator of u(n).
 * @author Georg Fischer
 */
public class A076737 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A076737() {
    super(1, "[[0],[-4],[0],[5],[0],[-1]]", "[2, 2, 2, 5, 3, 17, 11]", 0);
  }
}
