package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054609.
 * @author Sean A. Irvine
 */
public class A054609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054609() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 10, 1080, 59340, 1049680, 9768870, 60474120, 282492280, 1073774880, 3486843810L, 10000100440L});
  }
}
