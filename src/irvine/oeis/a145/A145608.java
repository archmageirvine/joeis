package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145608 Numbers <code>a(n)=k</code> such that <code>(1/3)*(5*(2k+1)^2-2)</code> is A057080(n)^2.
 * @author Sean A. Irvine
 */
public class A145608 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145608() {
    super(new long[] {1, -9, 9}, new long[] {0, 3, 27});
  }
}
