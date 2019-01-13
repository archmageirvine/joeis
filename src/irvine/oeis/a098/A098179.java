package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098179.
 * @author Sean A. Irvine
 */
public class A098179 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098179() {
    super(new long[] {-4, 10, -10, 5}, new long[] {1, 2, 3, 5});
  }
}
