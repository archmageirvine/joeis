package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191303 An infinite sequence of 4-digit half-palindromes.
 * @author Sean A. Irvine
 */
public class A191303 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191303() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {52029, 316725, 1093345, 2811129, 6031029});
  }
}
