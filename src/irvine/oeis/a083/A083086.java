package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083086 <code>a(n) (2*2^n + (-4)^n)/3</code>.
 * @author Sean A. Irvine
 */
public class A083086 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083086() {
    super(new long[] {8, -2}, new long[] {1, 0});
  }
}
