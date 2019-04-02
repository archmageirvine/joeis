package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125817 a(n)=((1 + 3Sqrt[2])^n - (1 - 3Sqrt[2])^n)/(2Sqrt[2]).
 * @author Sean A. Irvine
 */
public class A125817 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125817() {
    super(new long[] {17, 2}, new long[] {0, 3});
  }
}
