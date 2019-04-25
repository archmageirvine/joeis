package irvine.oeis.a243;

import irvine.oeis.LinearRecurrence;

/**
 * A243869 Expansion of <code>x^4/[(1+x)*Product_{k=1..3} (1-k*x)]</code>.
 * @author Sean A. Irvine
 */
public class A243869 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243869() {
    super(new long[] {6, -5, -5, 5}, new long[] {1, 5, 20, 70});
  }
}
