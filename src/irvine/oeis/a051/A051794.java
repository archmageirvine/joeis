package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051794 <code>a(n) =</code> sum((-1)^i * a(i), i <code>= n-6 .. n-1), a(1)=1, a(2)=1, a(3)=1, a(4)=1, a(5)=1, a(6)=1</code>.
 * @author Sean A. Irvine
 */
public class A051794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051794() {
    super(new long[] {1, 0, 1, 0, 1, 0, -1, 0, -1, 0, -1, 0}, new long[] {1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1});
  }
}
