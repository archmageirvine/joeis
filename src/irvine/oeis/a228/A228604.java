package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228604.
 * @author Sean A. Irvine
 */
public class A228604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228604() {
    super(new long[] {-25, 18}, new long[] {1, 18});
  }
}
