package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291462 <code>a(n) =</code> (1/2)*A291417(n)..
 * @author Sean A. Irvine
 */
public class A291462 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291462() {
    super(new long[] {-2, -4, 2, 4}, new long[] {2, 9, 38, 161});
  }
}
