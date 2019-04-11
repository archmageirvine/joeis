package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083229 <code>a(n) = (3*3^n + (-5)^n)/4</code>.
 * @author Sean A. Irvine
 */
public class A083229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083229() {
    super(new long[] {15, -2}, new long[] {1, 1});
  }
}
