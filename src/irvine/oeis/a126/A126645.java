package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126645 <code>a(n)</code> is the number of integers k less than <code>10^n</code> such that the decimal representation of k lacks the digits <code>1,2,3,4</code> and <code>5,</code> at least one of digits <code>6,7</code> and at least one of digits <code>8,9</code>.
 * @author Sean A. Irvine
 */
public class A126645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126645() {
    super(new long[] {6, -11, 6}, new long[] {5, 21, 77});
  }
}
