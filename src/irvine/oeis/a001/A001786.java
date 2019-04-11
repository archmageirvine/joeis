package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001786 Expansion of <code>1/((1+x)(1-x)^11)</code>.
 * @author Sean A. Irvine
 */
public class A001786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001786() {
    super(new long[] {1, -10, 44, -110, 165, -132, 0, 132, -165, 110, -44, 10}, new long[] {1, 10, 56, 230, 771, 2232, 5776, 13672, 30086, 62292, 122464, 230252});
  }
}
