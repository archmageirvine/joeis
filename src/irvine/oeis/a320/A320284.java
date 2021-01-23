package irvine.oeis.a320;

import irvine.oeis.FiniteSequence;

/**
 * A320284 Pierce expansion whose sum has the concatenation of its terms as decimal part. Case a(1) = 3.
 * @author Georg Fischer
 */
public class A320284 extends FiniteSequence {

  /** Construct the sequence. */
  public A320284() {
    super(3, 322, 991, 8111, 52473, 60206, 529366, 957640, 7693680, 69425274);
  }
}
