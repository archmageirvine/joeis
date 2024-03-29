package irvine.oeis.a108;
// Generated by gen_seq4.pl 2023-11-30/filter at 2023-12-03 21:34

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000217;
import irvine.oeis.a178.A178914;

/**
 * A108970 Concatenation of triangular number k and its 10's complement is prime.
 * @author Georg Fischer
 */
public class A108970 extends FilterSequence {

  /** Construct the sequence. */
  public A108970() {
    super(1, new A000217(), v -> new Z(v.toString() + new A178914().a(v).toString()).isProbablePrime());
  }
}
