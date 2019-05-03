package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259323 <code>2*A259322(n)</code>.
 * @author Sean A. Irvine
 */
public class A259323 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259323() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {2, 1460, 32710, 268008, 1330890, 4874012, 14527630, 37308880});
  }
}
