package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042715 Denominators of continued fraction convergents to sqrt(887).
 * @author Sean A. Irvine
 */
public class A042715 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042715() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 938448, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 4, 5, 9, 23, 676, 1375, 2051, 3426, 12329, 15755, 926119, 941874, 3751741, 4693615, 8445356, 21584327, 634390839, 1290366005, 1924756844, 3215122849L, 11570125391L, 14785248240L});
  }
}
