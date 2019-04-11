package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124191 <code>a(n)=((2 +</code> 3Sqrt[2])^n <code>- (2 -</code> 3Sqrt[2])^n)/(2Sqrt[2]).
 * @author Sean A. Irvine
 */
public class A124191 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124191() {
    super(new long[] {14, 4}, new long[] {0, 3});
  }
}
