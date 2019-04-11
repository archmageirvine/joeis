package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016186 Expansion of <code>1/((1-8x)(1-10x))</code>.
 * @author Sean A. Irvine
 */
public class A016186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016186() {
    super(new long[] {-80, 18}, new long[] {1, 18});
  }
}
