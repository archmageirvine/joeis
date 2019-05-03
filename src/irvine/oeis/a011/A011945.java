package irvine.oeis.a011;

import irvine.oeis.LinearRecurrence;

/**
 * A011945 Area of triangles with integral side lengths <code>m-1</code>, m, <code>m+1</code> and integral area.
 * @author Sean A. Irvine
 */
public class A011945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A011945() {
    super(new long[] {-1, 14}, new long[] {0, 6});
  }
}
