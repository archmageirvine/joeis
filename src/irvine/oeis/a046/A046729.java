package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046729 Expansion of <code>4x/((1+x)(1-6x+x^2))</code>.
 * @author Sean A. Irvine
 */
public class A046729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046729() {
    super(new long[] {-1, 5, 5}, new long[] {0, 4, 20});
  }
}
