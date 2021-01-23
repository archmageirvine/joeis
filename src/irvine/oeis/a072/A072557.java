package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072557 Let w(n) be defined by the following recurrence: w(1)=w(2)=w(3)=1, w(n)=(w(n-1)*w(n-2)+(w(n-1)+w(n-2))/3) / w(n-3); sequence gives values of n such that w(n) is an integer.
 * @author Sean A. Irvine
 */
public class A072557 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072557() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {5, 11, 16, 17, 18, 23});
  }
}
