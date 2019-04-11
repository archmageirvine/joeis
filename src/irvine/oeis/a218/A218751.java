package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218751 <code>a(n) = (48^n-1)/47</code>.
 * @author Sean A. Irvine
 */
public class A218751 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218751() {
    super(new long[] {-48, 49}, new long[] {0, 1});
  }
}
