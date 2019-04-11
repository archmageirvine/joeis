package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016175 Expansion of <code>1/((1-6x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A016175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016175() {
    super(new long[] {-72, 18}, new long[] {1, 18});
  }
}
