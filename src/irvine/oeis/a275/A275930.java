package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275930.
 * @author Sean A. Irvine
 */
public class A275930 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275930() {
    super(new long[] {-1, 13, 104, -260, -260, 104, 13}, new long[] {5, 256, 3159, 65625, 1114112, 20421115, 363484989});
  }
}
