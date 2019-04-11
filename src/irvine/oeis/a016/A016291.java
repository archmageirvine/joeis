package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016291 Expansion of <code>1/((1-2x)*(1-4x)*(1-9x))</code>.
 * @author Sean A. Irvine
 */
public class A016291 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016291() {
    super(new long[] {72, -62, 15}, new long[] {1, 15, 163});
  }
}
