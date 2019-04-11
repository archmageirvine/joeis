package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016770 <code>a(n) = (3*n)^6</code>.
 * @author Sean A. Irvine
 */
public class A016770 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016770() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 729, 46656, 531441, 2985984, 11390625, 34012224});
  }
}
