package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083316 <code>(2*6^n-(5^n-3^n))/2</code>.
 * @author Sean A. Irvine
 */
public class A083316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083316() {
    super(new long[] {90, -63, 14}, new long[] {1, 5, 28});
  }
}
