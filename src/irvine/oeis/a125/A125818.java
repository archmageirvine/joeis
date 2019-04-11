package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125818 <code>a(n)=((1 +</code> 3Sqrt[2])^n <code>+ (1 -</code> 3Sqrt[2])^n)/(2).
 * @author Sean A. Irvine
 */
public class A125818 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125818() {
    super(new long[] {17, 2}, new long[] {1, 1});
  }
}
