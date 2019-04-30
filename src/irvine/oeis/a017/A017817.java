package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017817 <code>a(n) = a(n-3) + a(n-4)</code>, with <code>a(0)=1, a(1)=a(2)=0, a(3)=1</code>.
 * @author Sean A. Irvine
 */
public class A017817 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017817() {
    super(new long[] {1, 1, 0, 0}, new long[] {1, 0, 0, 1});
  }
}
