package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016184 Expansion of <code>1/((1-7x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A016184 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016184() {
    super(new long[] {-84, 19}, new long[] {1, 19});
  }
}
