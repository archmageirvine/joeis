package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168576.
 * @author Sean A. Irvine
 */
public class A168576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168576() {
    super(new long[] {10000000000L, -11111000000L, 1122211000, -11222110, 11111}, new long[] {16, 14641, 104060401, 1004006004001L, 10004000600040001L});
  }
}
