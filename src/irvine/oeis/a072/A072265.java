package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072265 Variant of Lucas numbers: <code>a(n) = a(n-1)+4*a(n-2)</code> starting with <code>a(0)=2</code> and <code>a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A072265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072265() {
    super(new long[] {4, 1}, new long[] {2, 1});
  }
}
