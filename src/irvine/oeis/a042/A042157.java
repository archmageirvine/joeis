package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042157 Denominators of continued fraction convergents to sqrt(603).
 * @author Sean A. Irvine
 */
public class A042157 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042157() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 97684, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 7, 9, 214, 223, 883, 1106, 1989, 96578, 98567, 195145, 684002, 879147, 20904383, 21783530, 86254973, 108038503, 194293476});
  }
}
