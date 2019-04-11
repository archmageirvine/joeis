package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168564 <code>a(n) = n^6*(n^4 + 1)/2</code>.
 * @author Sean A. Irvine
 */
public class A168564 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168564() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 1, 544, 29889, 526336, 4890625, 30256416, 141296449, 537001984, 1743657921, 5000500000L});
  }
}
