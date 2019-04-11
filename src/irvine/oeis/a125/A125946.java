package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125946 <code>a(n)</code> is the number of nonnegative integers k less than <code>10^n</code> such that the decimal representation of k lacks at least one of digits <code>1,2,</code> at least one of digits <code>3,4,5</code> and at least one of digits <code>6,7,8,9</code>.
 * @author Sean A. Irvine
 */
public class A125946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125946() {
    super(new long[] {5040, -13068, 13132, -6769, 1960, -322, 28}, new long[] {10, 98, 940, 8798, 80140, 709238, 6096100});
  }
}
