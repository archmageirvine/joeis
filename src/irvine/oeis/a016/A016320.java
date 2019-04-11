package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016320 Expansion of <code>1/((1-2x)(1-8x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A016320 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016320() {
    super(new long[] {192, -136, 22}, new long[] {1, 22, 348});
  }
}
