package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253175 Indices of hexagonal numbers <code>(A000384)</code> which are also centered hexagonal numbers <code>(A003215)</code>.
 * @author Sean A. Irvine
 */
public class A253175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253175() {
    super(new long[] {1, -11, 11}, new long[] {1, 7, 67});
  }
}
