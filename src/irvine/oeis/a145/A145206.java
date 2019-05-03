package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145206 Numbers X such that <code>201*X^2+67</code> is a square.
 * @author Sean A. Irvine
 */
public class A145206 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145206() {
    super(new long[] {-1, 1030190}, new long[] {293, 301845963});
  }
}
