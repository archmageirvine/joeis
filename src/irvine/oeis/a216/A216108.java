package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216108.
 * @author Sean A. Irvine
 */
public class A216108 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216108() {
    super(new long[] {-1, 4, -6, 4}, new long[] {27, 198, 585, 1260});
  }
}
