package irvine.oeis.a383;

import irvine.oeis.FilterSequence;

/**
 * A383243 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A383243 extends FilterSequence {

  public A383243() {
    super(1, new A383241(), PRIME);
  }
}

