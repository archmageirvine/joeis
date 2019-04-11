package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179980 <code>a(n)=10*a(n-1)+/-</code> n.
 * @author Sean A. Irvine
 */
public class A179980 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179980() {
    super(new long[] {10, 19, 8}, new long[] {1, 8, 83});
  }
}
