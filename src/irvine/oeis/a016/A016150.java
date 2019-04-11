package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016150 Expansion of <code>1/((1-4x)(1-7x))</code>.
 * @author Sean A. Irvine
 */
public class A016150 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016150() {
    super(new long[] {-28, 11}, new long[] {1, 11});
  }
}
