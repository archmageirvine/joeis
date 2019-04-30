package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072560 Denominators of <code>w(n)</code> where <code>w(1)=w(2)=w(3)=1, w(n)=(w(n-1)*w(n-2)+(w(n-1)+w(n-2))/3) / w(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A072560 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072560() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {3, 9, 3, 3, 1, 3, 3, 9, 3, 3, 1, 3, 3, 9, 3, 1, 1, 1});
  }
}
