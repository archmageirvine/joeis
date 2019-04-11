package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122189 Heptanacci numbers: each term is the sum of the preceding 7 terms, with <code>a(0),</code>...,a(6) <code>= 0,0,0,0,0,0,1</code>.
 * @author Sean A. Irvine
 */
public class A122189 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122189() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1}, new long[] {0, 0, 0, 0, 0, 0, 1});
  }
}
