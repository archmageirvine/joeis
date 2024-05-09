package irvine.oeis.a189;

import irvine.oeis.FilterSequence;
import irvine.oeis.a045.A045542;

/**
 * A189045 Semiprimes which are sub-perfect powers.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A189045 extends FilterSequence {

  /** Construct the sequence. */
  public A189045() {
    super(1, new A045542(), SEMIPRIME);
  }
}
