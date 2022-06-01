package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135918 Genus of stage-n Menger sponge.
 * @author Sean A. Irvine
 */
public class A135918 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135918() {
    super(new long[] {160, -188, 29}, new long[] {0, 5, 81});
  }
}
