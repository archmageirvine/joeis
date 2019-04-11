package irvine.oeis.a207;

import irvine.oeis.LinearRecurrence;

/**
 * A207809 Number of 4 X <code>n 0..1</code> arrays avoiding <code>0 0 0</code> and <code>0 0 1</code> horizontally and <code>0 1 0</code> and <code>1 0 1</code> vertically.
 * @author Sean A. Irvine
 */
public class A207809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A207809() {
    super(new long[] {1, 1, -12, 4, 13, 2}, new long[] {10, 100, 370, 1970, 9040, 43990});
  }
}
