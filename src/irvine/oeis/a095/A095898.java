package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095898 The <code>(1,1)-term</code> of the <code>3 X 3</code> matrix <code>M^n</code>, where M <code>= [1,2,3 / 4,7,11 / 6,10,16]</code>.
 * @author Sean A. Irvine
 */
public class A095898 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095898() {
    super(new long[] {1, 24}, new long[] {1, 27});
  }
}
