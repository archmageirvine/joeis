package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091903 Expansion of <code>x/((1+5x)(1-10x))</code>.
 * @author Sean A. Irvine
 */
public class A091903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091903() {
    super(new long[] {50, 5}, new long[] {0, 1});
  }
}
