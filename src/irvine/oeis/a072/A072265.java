package irvine.oeis.a072;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A072265 Variant of Lucas numbers: a(n) = a(n-1) + 4*a(n-2) starting with a(0)=2 and a(1)=1.
 * @author Sean A. Irvine
 */
public class A072265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072265() {
    super(new long[] {4, 1}, new long[] {2, 1});
  }
}
