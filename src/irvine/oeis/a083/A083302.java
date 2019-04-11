package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083302 <code>a(n) = (4*9^n + (-1)^n)/5</code>.
 * @author Sean A. Irvine
 */
public class A083302 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083302() {
    super(new long[] {9, 8}, new long[] {1, 7});
  }
}
