package irvine.oeis.a059;
// generated by patch_offset.pl at 2023-06-16 18:27

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001036;

/**
 * A059966 a(n) = (1/n) * Sum_{ d divides n } mu(n/d) * (2^d - 1).
 * @author Sean A. Irvine
 */
public class A059966 extends DifferenceSequence {

  /** Construct the sequence. */
  public A059966() {
    super(1, new PrependSequence(new A001036(), 0));
  }
}
