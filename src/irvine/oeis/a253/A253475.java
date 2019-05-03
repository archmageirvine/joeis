package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253475 Indices of centered square numbers <code>(A001844)</code> which are also centered hexagonal numbers <code>(A003215)</code>.
 * @author Sean A. Irvine
 */
public class A253475 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253475() {
    super(new long[] {1, -11, 11}, new long[] {1, 6, 55});
  }
}
