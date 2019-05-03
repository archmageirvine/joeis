package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259079 Octagonal numbers <code>(A000567)</code> that are other octagonal numbers divided by 2.
 * @author Sean A. Irvine
 */
public class A259079 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259079() {
    super(new long[] {1, -1331715, 1331715}, new long[] {280, 373212840, 497012764340408L});
  }
}
