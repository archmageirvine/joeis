package irvine.oeis.a060;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A060569 Consider Pythagorean triples which satisfy X^2+(X+7)^2=Z^2; sequence gives increasing values of Z.
 * @author Sean A. Irvine
 */
public class A060569 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060569() {
    super(1, new long[] {-1, 0, 6, 0}, new long[] {13, 17, 73, 97});
  }
}
