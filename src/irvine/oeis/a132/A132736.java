package irvine.oeis.a132;
// Generated by patch_prepend.pl 2023-06-19 07:07

import irvine.oeis.PrependSequence;
import irvine.oeis.a052.A052944;

/**
 * A132736 Row sums of triangle A132735.
 * @author Georg Fischer
 */
public class A132736 extends PrependSequence {

  /** Construct the sequence. */
  public A132736() {
    super(new A052944().skip(1), 1);
  }
}
