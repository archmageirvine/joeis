package irvine.oeis.a251;

import irvine.oeis.a391.A391322;

/**
 * A251756 a(0) = 0; for n&gt;0, a(n) is the smallest integer not already in the list with a composite common factor with a(n-1).
 * @author Sean A. Irvine
 */
public class A251756 extends A391322 {

  /** Construct the sequence. */
  public A251756() {
    super(0, 0, 2);
  }
}
