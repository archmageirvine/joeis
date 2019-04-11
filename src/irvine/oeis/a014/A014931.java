package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014931 <code>a(1)=1, a(n)=n*16^(n-1)+a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A014931 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014931() {
    super(new long[] {256, -288, 33}, new long[] {1, 33, 801});
  }
}
