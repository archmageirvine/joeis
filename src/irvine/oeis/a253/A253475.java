package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253475 Indices of centered square numbers (A001844) which are also centered hexagonal numbers (A003215).
 * @author Sean A. Irvine
 */
public class A253475 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253475() {
    super(new long[] {1, -11, 11}, new long[] {1, 6, 55});
  }
}
