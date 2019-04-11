package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256008 Self-inverse permutation of positive integers: <code>4k+1</code> is swapped with <code>4k+3,</code> and <code>4k+2</code> with <code>4k+4</code>.
 * @author Sean A. Irvine
 */
public class A256008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256008() {
    super(new long[] {-1, 2, -2, 2}, new long[] {3, 4, 1, 2});
  }
}
