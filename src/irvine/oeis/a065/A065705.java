package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065705 <code>a(n) = Lucas(10*n)</code>.
 * @author Sean A. Irvine
 */
public class A065705 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065705() {
    super(new long[] {-1, 123}, new long[] {2, 123});
  }
}
