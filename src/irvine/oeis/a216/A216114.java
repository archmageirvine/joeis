package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216114 The Wiener index of a link of n fullerenes <code>C_{20} (see</code> the Ghorbani and Hosseinzadeh <code>reference)</code>.
 * @author Sean A. Irvine
 */
public class A216114 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216114() {
    super(new long[] {-1, 4, -6, 4}, new long[] {500, 3400, 9900, 21200});
  }
}
