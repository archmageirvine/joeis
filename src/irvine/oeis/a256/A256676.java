package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256676 Digital roots of centered 11-gonal numbers <code>(A069125)</code>.
 * @author Sean A. Irvine
 */
public class A256676 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256676() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 3, 7, 4, 3, 4, 7, 3, 1});
  }
}
