package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017226 <code>a(n) = (9*n + 5)^6</code>.
 * @author Sean A. Irvine
 */
public class A017226 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017226() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {15625, 7529536, 148035889, 1073741824, 4750104241L, 15625000000L, 42180533641L});
  }
}
