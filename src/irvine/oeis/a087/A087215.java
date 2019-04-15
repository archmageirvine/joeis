package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087215 <code>Lucas(6*n)</code>: <code>a(n) = 18*a(n-1) - a(n-2),</code> starting with <code>a(0) = 2</code> and <code>a(1) = 18</code>.
 * @author Sean A. Irvine
 */
public class A087215 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087215() {
    super(new long[] {-1, 18}, new long[] {2, 18});
  }
}
