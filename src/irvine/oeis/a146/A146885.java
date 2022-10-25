package irvine.oeis.a146;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A146885 a(n) = 8*Sum_{k=0..n} 7^k.
 * @author Georg Fischer
 */
public class A146885 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A146885() {
    super(0, "[[0],[-7],[8],[-1]]", "8", 0);
  }
}
