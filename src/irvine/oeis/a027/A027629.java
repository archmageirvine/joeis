package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027629 Molien series for complex 8-dimensional group N_3 of order <code>2^(2</code>.3+2), a central extension of <code>an</code> extraspecial 2-group.
 * @author Sean A. Irvine
 */
public class A027629 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027629() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 15, 135, 870, 3993, 14157, 41535, 105740});
  }
}
