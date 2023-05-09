package irvine.oeis.a063;

import irvine.oeis.FilterSequence;

/**
 * A063702 Composite numbers k such that phi(k + d(k)) = phi(k) + d(k), where phi() = A000010(), d() = A000005().
 * @author Sean A. Irvine
 */
public class A063702 extends FilterSequence {

  /** Construct the sequence. */
  public A063702() {
    super(new A063693(), k -> !k.isProbablePrime());
  }
}

