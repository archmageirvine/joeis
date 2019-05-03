package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242728 Sequence <code>a(n)</code> with all <code>(x,y)=(a(2m),a(2m+-1))</code> satisfying <code>y|x^2+1</code> and <code>x|y^2+y+1</code>.
 * @author Sean A. Irvine
 */
public class A242728 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242728() {
    super(new long[] {1, -4, 0, 4}, new long[] {1, 2, 7, 25});
  }
}
