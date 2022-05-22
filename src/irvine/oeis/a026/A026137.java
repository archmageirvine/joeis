package irvine.oeis.a026;

import irvine.oeis.InverseSequence;

/**
 * A026137 a(n) = position of n in A026136.
 * @author Sean A. Irvine
 */
public class A026137 extends InverseSequence {

  /** Construct the sequence. */
  public A026137() {
    super(new A026136());
  }
}
