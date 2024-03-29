package irvine.oeis.a144;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(6*x-x^2)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A144142 a(n) = Hermite(n,3).
 * @author Georg Fischer
 */
public class A144142 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A144142() {
    super(0, "[[0],[2],[-6],[2,1]]", "[1,6,34,180]", 2);
    setGfType(1);
  }
}
