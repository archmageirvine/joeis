package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081069 <code>Lucas(4n)+2</code>, or <code>Lucas(2n)^2</code>.
 * @author Sean A. Irvine
 */
public class A081069 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081069() {
    super(new long[] {1, -8, 8}, new long[] {4, 9, 49});
  }
}
