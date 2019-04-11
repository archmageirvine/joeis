package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019618 Expansion of <code>1/((1-4*x)*(1-7*x)*(1-10*x))</code>.
 * @author Sean A. Irvine
 */
public class A019618 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019618() {
    super(new long[] {280, -138, 21}, new long[] {1, 21, 303});
  }
}
