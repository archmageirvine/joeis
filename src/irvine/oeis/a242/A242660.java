package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242660 Nonnegative numbers of the form <code>x^2+xy-2y^2</code>.
 * @author Sean A. Irvine
 */
public class A242660 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242660() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 4, 7, 9});
  }
}
