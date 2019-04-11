package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081044 9th binomial transform of <code>(1,8,0,0,0,0,0,0,.....)</code>.
 * @author Sean A. Irvine
 */
public class A081044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081044() {
    super(new long[] {-81, 18}, new long[] {1, 17});
  }
}
