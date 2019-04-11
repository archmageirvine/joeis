package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017214 <code>a(n) = (9*n + 4)^6</code>.
 * @author Sean A. Irvine
 */
public class A017214 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017214() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {4096, 4826809, 113379904, 887503681, 4096000000L, 13841287201L, 38068692544L});
  }
}
