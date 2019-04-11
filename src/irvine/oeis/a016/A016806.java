package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016806 <code>(4n)^6</code>.
 * @author Sean A. Irvine
 */
public class A016806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016806() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 4096, 262144, 2985984, 16777216, 64000000, 191102976});
  }
}
