package irvine.oeis.a070;

import irvine.oeis.FilterSequence;

/**
 * A070287.
 * @author Sean A. Irvine
 */
public class A070329 extends FilterSequence {

  /** Construct the sequence. */
  public A070329() {
    super(1, new A070328(), k -> k.mod(3) != 2);
  }
}
