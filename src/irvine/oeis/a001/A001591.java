package irvine.oeis.a001;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A001591 Pentanacci numbers: a(n) = a(n-1) + a(n-2) + a(n-3) + a(n-4) + a(n-5), a(0)=a(1)=a(2)=a(3)=0, a(4)=1.
 * @author Sean A. Irvine
 */
public class A001591 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001591() {
    super(new long[] {1, 1, 1, 1, 1}, new long[] {0, 0, 0, 0, 1});
  }
}
