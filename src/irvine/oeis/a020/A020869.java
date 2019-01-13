package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020869.
 * @author Sean A. Irvine
 */
public class A020869 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020869() {
    super(new long[] {1, -9, 40, -108, 190, -218, 156, -64, 13}, new long[] {34, 222, 1280, 6955, 36378, 185178, 923696, 4535991, 22000490});
  }
}
