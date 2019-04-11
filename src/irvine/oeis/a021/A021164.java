package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021164 Expansion of <code>1/((1-x)*(1-2*x)*(1-5*x)*(1-12*x))</code>.
 * @author Sean A. Irvine
 */
public class A021164 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021164() {
    super(new long[] {-120, 214, -113, 20}, new long[] {1, 20, 287, 3694});
  }
}
