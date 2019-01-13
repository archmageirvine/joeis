package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091775.
 * @author Sean A. Irvine
 */
public class A091775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091775() {
    super(new long[] {-576, 820, -273, 30}, new long[] {30, 354, 4890, 72354});
  }
}
