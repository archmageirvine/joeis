package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020872 Number of restricted forests in Moebius ladder M_n.
 * @author Sean A. Irvine
 */
public class A020872 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020872() {
    super(new long[] {1, -3, -6, 25, -3, -56, 43, 23, -34, 11}, new long[] {34, 241, 1582, 10204, 65197, 415076, 2638366, 16759249, 106427154, 675771276});
  }
}
