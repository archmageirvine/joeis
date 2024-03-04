package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145206 Numbers x such that 201*x^2 + 67 is a square.
 * @author Sean A. Irvine
 */
public class A145206 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145206() {
    super(1, new long[] {-1, 1030190}, new long[] {293, 301845963});
  }
}
