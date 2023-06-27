package irvine.oeis.a229;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A229903 (190/99)*(100^A001651(n)-1).
 * @author Sean A. Irvine
 */
public class A229903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A229903() {
    super(1, new long[] {-1000000, 1000000, 1}, new long[] {190, 19190, 191919190});
  }
}
