package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212705 <code>a(n)</code> is the difference between numbers of nonnegative multiples of <code>2*n+1</code> with even and odd digit sum in base <code>2*n</code> in interval <code>[0, (2*n)^8)</code>.
 * @author Sean A. Irvine
 */
public class A212705 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212705() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {54, 3220, 38794, 237832, 995710, 3256540, 8954258, 21645200});
  }
}
