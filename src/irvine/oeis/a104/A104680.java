package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104680 <code>a(n) =</code> binomial(n+7,7)*binomial(n+12,7).
 * @author Sean A. Irvine
 */
public class A104680 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104680() {
    super(new long[] {1, -15, 105, -455, 1365, -3003, 5005, -6435, 6435, -5005, 3003, -1365, 455, -105, 15}, new long[] {792, 13728, 123552, 772200, 3775200, 15402816, 54609984, 172931616, 498841200, 1330243200, 3316739712L, 7801876368L, 17439488352L, 37263864000L, 76488984000L});
  }
}
