package irvine.oeis.a094;
// manually modified 2021-05-14 23:57

import irvine.oeis.a095.A095437;

/**
 * A094203 a(n) = 24 written in base 13-n.
 * @author Georg Fischer
 */
public class A094203 extends A095437 {

  {
    setOffset(1);
  }

  /** Construct the sequence. */
  public A094203() {
    super(24, 13);
    ++super.mN;
  }
}
