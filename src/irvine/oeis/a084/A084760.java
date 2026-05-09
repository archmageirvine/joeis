package irvine.oeis.a084;

import irvine.oeis.a005.A005117;

/**
 * A084760 Squarefree numbers in ascending order such that the difference of successive terms is unique. a(m) - a(m-1) = a(k) - a(k-1) iff m = k.
 * @author Sean A. Irvine
 */
public class A084760 extends A084759 {

  /** Construct the sequence. */
  public A084760() {
    super(new A005117().skip());
  }
}
