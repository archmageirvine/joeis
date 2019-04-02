package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095905 Sequence generated from Golomb's proof of de Bruijn's theorem on a torus considered as a matrix.
 * @author Sean A. Irvine
 */
public class A095905 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095905() {
    super(new long[] {18, 15}, new long[] {1, 21});
  }
}
