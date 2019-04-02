package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017589 (12n+5)^9.
 * @author Sean A. Irvine
 */
public class A017589 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017589() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1953125, 118587876497L, 14507145975869L, 327381934393961L, 3299763591802133L, 20711912837890625L, 95151694449171437L, 350356403707485209L, 1093685272684360901L, 3004041937984268273L});
  }
}
