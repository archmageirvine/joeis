package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141425 Period 6: repeat <code>[1, 2, 4, 5, 7, 8]</code>.
 * @author Sean A. Irvine
 */
public class A141425 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141425() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {1, 2, 4, 5, 7, 8});
  }
}
