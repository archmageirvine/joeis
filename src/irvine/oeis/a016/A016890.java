package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016890.
 * @author Sean A. Irvine
 */
public class A016890 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016890() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {729, 262144, 4826809, 34012224, 148035889, 481890304, 1291467969});
  }
}
