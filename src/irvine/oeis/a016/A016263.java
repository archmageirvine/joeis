package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016263 Expansion of <code>1/((1-x)(1-9x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A016263 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016263() {
    super(new long[] {108, -129, 22}, new long[] {1, 22, 355});
  }
}
