package irvine.oeis.a183;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A183777 Half the number of (n+1) X 5 binary arrays with no 2 X 2 subblock having exactly 2 ones.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A183777 extends LinearRecurrence {

  /** Construct the sequence. */
  public A183777() {
    super(0, new long[] {512, -256, -1024, 392, 580, -188, -98, 26, 5},
      new long[] {16, 85, 567, 3435, 21935, 136843, 864671, 5431499, 34228999});
  }
}
