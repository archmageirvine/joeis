package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025985 Expansion of <code>1/((1-2x)(1-4x)(1-11x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A025985 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025985() {
    super(new long[] {-1056, 976, -278, 29}, new long[] {1, 29, 563, 9241});
  }
}
