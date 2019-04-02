package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046180 Hexagonal pentagonal numbers.
 * @author Sean A. Irvine
 */
public class A046180 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046180() {
    super(new long[] {1, -37635, 37635}, new long[] {1, 40755, 1533776805});
  }
}
