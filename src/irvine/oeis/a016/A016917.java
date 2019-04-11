package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016917 <code>a(n) = (6*n)^9</code>.
 * @author Sean A. Irvine
 */
public class A016917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016917() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 10077696, 5159780352L, 198359290368L, 2641807540224L, 19683000000000L, 101559956668416L, 406671383849472L, 1352605460594688L, 3904305912313344L});
  }
}
