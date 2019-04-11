package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016926 <code>a(n) = (6*n + 1)^6</code>.
 * @author Sean A. Irvine
 */
public class A016926 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016926() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 117649, 4826809, 47045881, 244140625, 887503681, 2565726409L});
  }
}
