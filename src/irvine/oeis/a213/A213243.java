package irvine.oeis.a213;

import irvine.oeis.Conjectural;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A213243 Number of nonzero elements in GF(2^n) that are cubes.
 * @author Sean A. Irvine
 */
public class A213243 extends LinearRecurrence implements Conjectural {


  /** Construct the sequence. */
  public A213243() {
    super(new long[] {-4, 0, 5, 0}, new long[] {1, 1, 7, 5});
  }
}
