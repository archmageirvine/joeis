package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177842 Period <code>27</code>: repeat <code>1, 81, 81, 3, 81, 81, 9, 81, 81, 3, 81, 81, 3, 81, 81, 9, 81, 81, 3, 81, 81, 1, 81, 81, 9, 81, 81</code>.
 * @author Sean A. Irvine
 */
public class A177842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177842() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 81, 81, 3, 81, 81, 9, 81, 81, 3, 81, 81, 3, 81, 81, 9, 81, 81, 3, 81, 81, 1, 81, 81, 9, 81, 81});
  }
}
