package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075112 a(n)=Sum((-1)^(i+Floor(n/2))S(2i+e),(i=0,..,Floor(n/2))), where <code>S(n)</code> are generalized Tetranacci numbers (A073817) and e=(1/2)(1-(-1)^n).
 * @author Sean A. Irvine
 */
public class A075112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075112() {
    super(new long[] {1, 1, 2, 2, 0, 1}, new long[] {4, 1, -1, 6, 16, 20});
  }
}
