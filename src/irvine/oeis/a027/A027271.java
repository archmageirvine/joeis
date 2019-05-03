package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027271 <code>a(n) = Sum_{k=0..2n} (k+1)*T(n,k)</code>, where T is given by <code>A026536</code>.
 * @author Sean A. Irvine
 */
public class A027271 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027271() {
    super(new long[] {-36, 0, 12, 0}, new long[] {1, 4, 18, 48});
  }
}
