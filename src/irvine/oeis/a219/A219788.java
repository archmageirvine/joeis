package irvine.oeis.a219;

import irvine.oeis.LinearRecurrence;

/**
 * A219788 Consider the succession rule <code>(x, y, z) -&gt; (z, y+z, x+y+z).</code> Sequence gives z values starting at <code>(0, 1, 2)</code>.
 * @author Sean A. Irvine
 */
public class A219788 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219788() {
    super(new long[] {-1, 1, 2}, new long[] {2, 3, 8});
  }
}
