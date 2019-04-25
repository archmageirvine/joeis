package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123116 Values y of solutions <code>(x, y)</code> to the Diophantine equation <code>(x-y)^4-8xy=0</code> with <code>x&gt;=y</code>.
 * @author Sean A. Irvine
 */
public class A123116 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123116() {
    super(new long[] {-1, 40, -206, 40}, new long[] {0, 4, 192, 6860});
  }
}
